__author__ = 'qichao'

import urllib.request

request = urllib.request.Request('http://www.geekdigging.com/')
response = urllib.request.urlopen(request)
print(response.read().decode('utf-8'))
