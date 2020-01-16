__author__ = 'qichao'

from lxml import etree
import requests

response = requests.get('https://zhuanlan.zhihu.com/p/101141124')
html_str = response.content.decode('UTF-8')
html = etree.HTML(html_str)

result_1 = html.xpath('/html/body/div[1]/div/main/div/article/header/div[1]/div/div/div[1]/span/div/div/a')
print(result_1)