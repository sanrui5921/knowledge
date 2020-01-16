__author__ = 'qichao'

import requests
from bs4 import BeautifulSoup

headers = {
    'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36'}

response = requests.get('https://zhuanlan.zhihu.com/p/101141124', headers=headers)
soup = BeautifulSoup(response.content, "html5lib")
print(soup.prettify())

print(soup.title)
print(soup.title.string)

print(soup.find_all(name="a"))
print(type(soup.find_all(name="a")))
