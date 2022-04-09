#!/user/bin/python3
from scapy.all import *

def spoof_pkt(pkt):
   if ICMP in pkt and pkt[ICMP].type == 8:
     print("Original Packet......")      
     print ("Source IP: ", pkt[IP].src)
     print ("Destination IP: ", pkt[IP].dst)
     
     ip = IP(src=pkt[IP].dst, dst=pkt[IP].src, ihl=pkt[IP].ihl)
     icmp = ICMP(type=0, id=pkt[ICMP].id, seq=pkt[ICMP].seq)
     data="Fake Message!\n"
     newpkt = ip/icmp/data

     print ("Spoofed Packet......")
     print ("Source IP: ", newpkt[IP].src)
     print ("Destination IP: ", newpkt[IP].dst)
     send(newpkt, verbose=0)

pkt = sniff(filter='icmp and src host 192.168.56.103',prn=spoof_pkt)
