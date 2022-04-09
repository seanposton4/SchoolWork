#!/usr/bin/python3
from scapy.all import *

print("SEDNING SPOOFED ICMP PAKET......")
# Create an IP object from the IP class
ip = IP(src="192.168.56.103", dst="192.168.56.200") # IP Layer
# Creates an ICMP object
icmp = ICMP()
# Stack two header objects ip and icmp together to form a new object
pkt = ip/icmp
pkt.show()
# send out this packet
send(pkt, verbose=0)
