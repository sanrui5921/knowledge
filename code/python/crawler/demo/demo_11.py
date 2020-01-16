__author__ = 'qichao'

from lxml import etree
import requests

response = requests.get('http://www.geekdigging.com/')
html_str = response.content.decode('UTF-8')
html = etree.HTML(html_str)
result = etree.tostring(html, encoding='UTF-8').decode('UTF-8')
print(result)

result_2 = html.xpath('//meta')
print(result_2)
