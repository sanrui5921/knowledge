__author__ = 'qichao'

from urllib.parse import urlparse

result = urlparse('https://docs.python.org/zh-cn/3.7/library/urllib.parse.html#module-urllib.parse')
print(type(result))
print(result)
d