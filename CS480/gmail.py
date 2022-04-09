# Based on https://www.interviewqs.com/blog/py_email

import smtplib

from email.mime.multipart import MIMEMultipart

from email.mime.text import MIMEText

# Replace with your gmail

from_address = "from_email@gmail.com"

# Replace with your gmail

to_address = "to_email@gmail.com"

# Create message container - the correct MIME type is multipart/alternative.

msg = MIMEMultipart('alternative')

msg['Subject'] = "Test email"

msg['From'] = from_address

msg['To'] = to_address

# Create the message (HTML).

html = """\

We are sending an email using Python and Gmail, how fun! We can fill this with html, and gmail supports a decent range of css style attributes too - https://developers.google.com/gmail/design/css#example.

"""

# Record the MIME type - text/html.

part1 = MIMEText(html, 'html')

# Attach parts into message container

msg.attach(part1)

# Credentials

# Replace with your gmail

username = 'seanpocs480@gmail.com'

# Replace with your google APP password (not your gmail password)

password = 'bssnvpjsrfqxjyxi'

# Sending the email

server = smtplib.SMTP('smtp.gmail.com', 587)

server.ehlo()

server.starttls()

server.login(username, password)

server.sendmail(from_address, to_address, msg.as_string())

server.quit()
