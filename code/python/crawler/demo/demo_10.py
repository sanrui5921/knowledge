__author__ = 'qichao'
import requests

r = requests.get('https://httpbin.org/get')
print(r.text)
