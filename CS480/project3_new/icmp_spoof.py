#!/usr/bin/python3
from scapy.all import *

# Send spoofed icmp packet from the Ubuntu VM (192.168.56.104)
# to the Kali VM (192.168.56.103)
# Please replace them with yours.

print("SEDNING SPOOFED ICMP PAKET......")
# Create an IP object from the IP class
ip = IP(src="192.168.1.104", dst="192.168.1.103") # IP Layer
# Creates an ICMP object
icmp = ICMP()
# Stack two header objects ip and icmp together to form a new object
pkt = ip/icmp
pkt.show()
# send out this packet
send(pkt, verbose=0)
