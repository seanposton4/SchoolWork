#!/user/bin/python3
from scapy.all import *

# PC1 with IP: 150.201.169.24

print("SNIFFING PACKETS......")

# This function print out some of the informaiton about the packet
def print_pkt(pkt):
   print ("Source IP:", pkt[IP].src)
   print ("Destination IP:", pkt[IP].dst)
   print ("Protocol:", pkt[IP].proto)
   print ("\n")

# Start capturing packets
pkt = sniff(filter='icmp',prn=print_pkt)
