__author__ = 'qichao'

import http.cookiejar, urllib.request

# 实例化cookiejar对象
cookie = http.cookiejar.CookieJar()
# 使用 HTTPCookieProcessor 构建一个 handler
handler = urllib.request.HTTPCookieProcessor(cookie)
# 构建Opener
opener = urllib.request.build_opener(handler)
# 发起请求
response = opener.open('http://www.baidu.com/')
print(cookie)
for item in cookie:
    print(item.name + " = " + item.value)
