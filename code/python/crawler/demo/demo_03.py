__author__ = 'qichao'

import requests
from bs4 import BeautifulSoup

response = requests.get('https://www.geekdigging.com/')
soup = BeautifulSoup(response.content, "html5lib")
print(soup.prettify())
