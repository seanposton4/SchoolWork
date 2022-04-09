#!/usr/bin/python3
from scapy.all import *

print("SEDNING SPOOFED ICMP PAKET......")
ip = IP(src="0.0.0.0", dst="127.0.0.1") # IP Layer
udp = UDP(sport=8888, dport=9090) # UDP Layer
data = "Hello UDP!\n" # Payload
# data = "ZZZZZZ!\n"
pkt = ip/udp/data # Construct the complete packet
pkt.show()
send(pkt, verbose=0)
