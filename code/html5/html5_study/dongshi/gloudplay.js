///<jscompress sourcefile="common.js" />
function createJsCssFile(e, t) {
    if ("js" === t) {
        let t = document.createElement("script");
        t.setAttribute("type", "text/javascript"), t.setAttribute("src", e)
    } else if ("css" === t) {
        let t = document.createElement("link");
        t.setAttribute("rel", "stylesheet"), t.setAttribute("type", "text/css"), t.setAttribute("href", e)
    }
    return fileref
}
function replaceJsCssFile(e, t, r) {
    for (var n = "js" === r ? "script" : "css" === r ? "link" : "none", i = "js" === r ? "src" : "css" === r ? "href" : "none", s = document.getElementsByTagName(n), o = s.length; o >= 0; o--)if (s[o] && null != s[o].getAttribute(i) && -1 != s[o].getAttribute(i).indexOf(e)) {
        var a = createJsCssFile(t, r);
        s[o].parentNode.replaceChild(a, s[o])
    }
}
function removeJsCssFile(e, t) {
    for (var r = "js" === t ? "script" : "css" === t ? "link" : "none", n = "js" === t ? "src" : "css" === t ? "href" : "none", i = document.getElementsByTagName(r), s = i.length; s >= 0; s--)i[s] && null != i[s].getAttribute(n) && -1 != i[s].getAttribute(n).indexOf(e) && i[s].parentNode.removeChild(i[s])
}
function loadJsCssFile(e, t) {
    if ("js" === t) {
        let t = document.createElement("script");
        t.setAttribute("type", "text/javascript"), t.setAttribute("src", e)
    } else if ("css" === t) {
        let t = document.createElement("link");
        t.setAttribute("rel", "stylesheet"), t.setAttribute("type", "text/css"), t.setAttribute("href", e)
    }
    "undefined" != typeof fileref && document.getElementsByTagName("head")[0].appendChild(fileref)
}
function checkLoadJsCssFile(e, t) {
    -1 == filesadded.indexOf("[" + e + "]") && (loadJsCssFile(e, t), filesadded += "[" + e + "]")
}
function getQueryString(e, t, r) {
    var n = new RegExp("(^|&)" + e + "=([^&]*)(&|$)", "i"), i = window.location.search.substr(1).match(n), s = t;
    if (null != i) {
        switch (r) {
            case 1:
                s = parseInt(decodeURIComponent(i[2]));
                break;
            case 2:
                s = decodeURIComponent(i[2])
        }
        console.log(e + ":" + s)
    }
    return s
}
function GlobalUrlSearch() {
    for (var e, t, r = location.href, n = r.indexOf("?"), i = (r = r.substr(n + 1)).split("&"), s = 0; s < i.length; s++)(n = i[s].indexOf("=")) > 0 && (e = i[s].substring(0, n), t = i[s].substr(n + 1), this[e] = decodeURIComponent(t))
}
function getChromeVersion() {
    var e = navigator.userAgent.match(/Chrom(e|ium)\/([0-9]+)\./);
    return !!e && parseInt(e[2], 10)
}
function in_array(e, t) {
    for (var r = e.length; r--;)if (e[r] === t)return r;
    return null
}
function isIOS() {
    var e = ["iPad Simulator", "iPhone Simulator", "iPod Simulator", "iPad", "iPhone", "iPod"];
    if (navigator.platform)for (; e.length;)if (navigator.platform === e.pop())return !0;
    return !1
}
function detectIE() {
    var e = window.navigator.userAgent, t = e.indexOf("MSIE ");
    if (t > 0)return parseInt(e.substring(t + 5, e.indexOf(".", t)), 10);
    if (e.indexOf("Trident/") > 0) {
        var r = e.indexOf("rv:");
        return parseInt(e.substring(r + 3, e.indexOf(".", r)), 10)
    }
    var n = e.indexOf("Edge/");
    return n > 0 && parseInt(e.substring(n + 5, e.indexOf(".", n)), 10)
};
///<jscompress sourcefile="cursors.js" />
window.gloudCursors = {
    CURSOR_ARROW: "Qk2KEAAAAAAAAIoAAAB8AAAAIAAAACAAAAABACAAAwAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAD/AAD/AAAAAAAA/0JHUnOAwvUoYLgeFSCF6wFAMzMTgGZmJkBmZgagmZkJPArXAyRcjzIAAAAAAAAAAAAAAAAEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP////8A////AAAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/////wD///8AAAAA/wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP////8A////AAAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8AAAAAAAAAAAAAAAAAAAAAAAAA/////wD///8AAAAA/wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAAAP8AAAAAAAAAAAAAAP////8A////AAAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/////AAAAAP8AAAAAAAAA/////wD///8AAAAA/wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP////8A////AAAAAP////8A////AAAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/////wD///8A////AP///wD///8AAAAA/wAAAP8AAAD/AAAA/wAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/////AP///wD///8A////AP///wD///8A////AP///wAAAAD/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP////8A////AP///wD///8A////AP///wD///8AAAAA/wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/////wD///8A////AP///wD///8A////AAAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/////AP///wD///8A////AP///wAAAAD/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP////8A////AP///wD///8AAAAA/wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/////wD///8A////AAAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/////AP///wAAAAD/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP////8AAAAA/wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAAAP8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA==",
    CURSOR_IBEAM: "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAKQ2lDQ1BJQ0MgcHJvZmlsZQAAeNqdU3dYk/cWPt/3ZQ9WQtjwsZdsgQAiI6wIyBBZohCSAGGEEBJAxYWIClYUFRGcSFXEgtUKSJ2I4qAouGdBiohai1VcOO4f3Ke1fXrv7e371/u855zn/M55zw+AERImkeaiagA5UoU8Otgfj09IxMm9gAIVSOAEIBDmy8JnBcUAAPADeXh+dLA//AGvbwACAHDVLiQSx+H/g7pQJlcAIJEA4CIS5wsBkFIAyC5UyBQAyBgAsFOzZAoAlAAAbHl8QiIAqg0A7PRJPgUA2KmT3BcA2KIcqQgAjQEAmShHJAJAuwBgVYFSLALAwgCgrEAiLgTArgGAWbYyRwKAvQUAdo5YkA9AYACAmUIszAAgOAIAQx4TzQMgTAOgMNK/4KlfcIW4SAEAwMuVzZdL0jMUuJXQGnfy8ODiIeLCbLFCYRcpEGYJ5CKcl5sjE0jnA0zODAAAGvnRwf44P5Dn5uTh5mbnbO/0xaL+a/BvIj4h8d/+vIwCBAAQTs/v2l/l5dYDcMcBsHW/a6lbANpWAGjf+V0z2wmgWgrQevmLeTj8QB6eoVDIPB0cCgsL7SViob0w44s+/zPhb+CLfvb8QB7+23rwAHGaQJmtwKOD/XFhbnauUo7nywRCMW735yP+x4V//Y4p0eI0sVwsFYrxWIm4UCJNx3m5UpFEIcmV4hLpfzLxH5b9CZN3DQCshk/ATrYHtctswH7uAQKLDljSdgBAfvMtjBoLkQAQZzQyefcAAJO/+Y9AKwEAzZek4wAAvOgYXKiUF0zGCAAARKCBKrBBBwzBFKzADpzBHbzAFwJhBkRADCTAPBBCBuSAHAqhGJZBGVTAOtgEtbADGqARmuEQtMExOA3n4BJcgetwFwZgGJ7CGLyGCQRByAgTYSE6iBFijtgizggXmY4EImFINJKApCDpiBRRIsXIcqQCqUJqkV1II/ItchQ5jVxA+pDbyCAyivyKvEcxlIGyUQPUAnVAuagfGorGoHPRdDQPXYCWomvRGrQePYC2oqfRS+h1dAB9io5jgNExDmaM2WFcjIdFYIlYGibHFmPlWDVWjzVjHVg3dhUbwJ5h7wgkAouAE+wIXoQQwmyCkJBHWExYQ6gl7CO0EroIVwmDhDHCJyKTqE+0JXoS+cR4YjqxkFhGrCbuIR4hniVeJw4TX5NIJA7JkuROCiElkDJJC0lrSNtILaRTpD7SEGmcTCbrkG3J3uQIsoCsIJeRt5APkE+S+8nD5LcUOsWI4kwJoiRSpJQSSjVlP+UEpZ8yQpmgqlHNqZ7UCKqIOp9aSW2gdlAvU4epEzR1miXNmxZDy6Qto9XQmmlnafdoL+l0ugndgx5Fl9CX0mvoB+nn6YP0dwwNhg2Dx0hiKBlrGXsZpxi3GS+ZTKYF05eZyFQw1zIbmWeYD5hvVVgq9ip8FZHKEpU6lVaVfpXnqlRVc1U/1XmqC1SrVQ+rXlZ9pkZVs1DjqQnUFqvVqR1Vu6k2rs5Sd1KPUM9RX6O+X/2C+mMNsoaFRqCGSKNUY7fGGY0hFsYyZfFYQtZyVgPrLGuYTWJbsvnsTHYF+xt2L3tMU0NzqmasZpFmneZxzQEOxrHg8DnZnErOIc4NznstAy0/LbHWaq1mrX6tN9p62r7aYu1y7Rbt69rvdXCdQJ0snfU6bTr3dQm6NrpRuoW623XP6j7TY+t56Qn1yvUO6d3RR/Vt9KP1F+rv1u/RHzcwNAg2kBlsMThj8MyQY+hrmGm40fCE4agRy2i6kcRoo9FJoye4Ju6HZ+M1eBc+ZqxvHGKsNN5l3Gs8YWJpMtukxKTF5L4pzZRrmma60bTTdMzMyCzcrNisyeyOOdWca55hvtm82/yNhaVFnMVKizaLx5balnzLBZZNlvesmFY+VnlW9VbXrEnWXOss623WV2xQG1ebDJs6m8u2qK2brcR2m23fFOIUjynSKfVTbtox7PzsCuya7AbtOfZh9iX2bfbPHcwcEh3WO3Q7fHJ0dcx2bHC866ThNMOpxKnD6VdnG2ehc53zNRemS5DLEpd2lxdTbaeKp26fesuV5RruutK10/Wjm7ub3K3ZbdTdzD3Ffav7TS6bG8ldwz3vQfTw91jicczjnaebp8LzkOcvXnZeWV77vR5Ps5wmntYwbcjbxFvgvct7YDo+PWX6zukDPsY+Ap96n4e+pr4i3z2+I37Wfpl+B/ye+zv6y/2P+L/hefIW8U4FYAHBAeUBvYEagbMDawMfBJkEpQc1BY0FuwYvDD4VQgwJDVkfcpNvwBfyG/ljM9xnLJrRFcoInRVaG/owzCZMHtYRjobPCN8Qfm+m+UzpzLYIiOBHbIi4H2kZmRf5fRQpKjKqLupRtFN0cXT3LNas5Fn7Z72O8Y+pjLk722q2cnZnrGpsUmxj7Ju4gLiquIF4h/hF8ZcSdBMkCe2J5MTYxD2J43MC52yaM5zkmlSWdGOu5dyiuRfm6c7Lnnc8WTVZkHw4hZgSl7I/5YMgQlAvGE/lp25NHRPyhJuFT0W+oo2iUbG3uEo8kuadVpX2ON07fUP6aIZPRnXGMwlPUit5kRmSuSPzTVZE1t6sz9lx2S05lJyUnKNSDWmWtCvXMLcot09mKyuTDeR55m3KG5OHyvfkI/lz89sVbIVM0aO0Uq5QDhZML6greFsYW3i4SL1IWtQz32b+6vkjC4IWfL2QsFC4sLPYuHhZ8eAiv0W7FiOLUxd3LjFdUrpkeGnw0n3LaMuylv1Q4lhSVfJqedzyjlKD0qWlQyuCVzSVqZTJy26u9Fq5YxVhlWRV72qX1VtWfyoXlV+scKyorviwRrjm4ldOX9V89Xlt2treSrfK7etI66Trbqz3Wb+vSr1qQdXQhvANrRvxjeUbX21K3nShemr1js20zcrNAzVhNe1bzLas2/KhNqP2ep1/XctW/a2rt77ZJtrWv913e/MOgx0VO97vlOy8tSt4V2u9RX31btLugt2PGmIbur/mft24R3dPxZ6Pe6V7B/ZF7+tqdG9s3K+/v7IJbVI2jR5IOnDlm4Bv2pvtmne1cFoqDsJB5cEn36Z8e+NQ6KHOw9zDzd+Zf7f1COtIeSvSOr91rC2jbaA9ob3v6IyjnR1eHUe+t/9+7zHjY3XHNY9XnqCdKD3x+eSCk+OnZKeenU4/PdSZ3Hn3TPyZa11RXb1nQ8+ePxd07ky3X/fJ897nj13wvHD0Ivdi2yW3S609rj1HfnD94UivW2/rZffL7Vc8rnT0Tes70e/Tf/pqwNVz1/jXLl2feb3vxuwbt24m3Ry4Jbr1+Hb27Rd3Cu5M3F16j3iv/L7a/eoH+g/qf7T+sWXAbeD4YMBgz8NZD+8OCYee/pT/04fh0kfMR9UjRiONj50fHxsNGr3yZM6T4aeypxPPyn5W/3nrc6vn3/3i+0vPWPzY8Av5i8+/rnmp83Lvq6mvOscjxx+8znk98ab8rc7bfe+477rfx70fmSj8QP5Q89H6Y8en0E/3Pud8/vwv94Tz+4A5JREAAAAZdEVYdFNvZnR3YXJlAEFkb2JlIEltYWdlUmVhZHlxyWU8AAADdmlUWHRYTUw6Y29tLmFkb2JlLnhtcAAAAAAAPD94cGFja2V0IGJlZ2luPSLvu78iIGlkPSJXNU0wTXBDZWhpSHpyZVN6TlRjemtjOWQiPz4gPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0az0iQWRvYmUgWE1QIENvcmUgNS42LWMxNDUgNzkuMTYzNDk5LCAyMDE4LzA4LzEzLTE2OjQwOjIyICAgICAgICAiPiA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPiA8cmRmOkRlc2NyaXB0aW9uIHJkZjphYm91dD0iIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1wTU06T3JpZ2luYWxEb2N1bWVudElEPSJ4bXAuZGlkOmQ3NjIxNGY3LWZkMjEtY2E0ZS05Yzc2LWUyZWJhNTA4MjcyMiIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDowNUU2QzJDRTE1NzgxMUVBQjIzREQ0OEY2Mjk2MTk5QSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDowNUU2QzJDRDE1NzgxMUVBQjIzREQ0OEY2Mjk2MTk5QSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ0MgMjAxOSAoV2luZG93cykiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDozZmMwNjZlMy00MDlmLTZmNDAtOWRmMi1hNjM4M2YzNWUxMGUiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6ZDc2MjE0ZjctZmQyMS1jYTRlLTljNzYtZTJlYmE1MDgyNzIyIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+aG0IeAAAAS9JREFUeNrslb1qhEAQx2ejgh9ILsKBrxHTh2CTgL2NNrFOlyc5iL2N5REQ7ITjXiD4DGplc4oERQ83uweGFGn3bHaaHWaL+TEf/0EYY1jTxMUJwxBXVQWapoHruu+qqp6TJNn1fQ+maYLneYgFAFoqUNf18zRNt3mevx6PxxdZlsG27b1lWTuE0Leu619MAdq2BVEULxWIoug0zzMOgsBomgaID4ZhsG0BTTKO4wVAUZQThaNxCkgqwH4G/hqBEa81hDewsnEADsAB/t13QRDORIDQVQGo4pHEF7/rurtF/ehLVZJ5CyRJuifJnrIs+yyKYlOW5eZwOOxJ7JH8PbAC+D1GcRxjchHpHQDHcd5oPE3Tj2EYYLvdgu/7bM8xX0MOwAE4AAfgABxgLfsRYADDFnZ+ccZcEgAAAABJRU5ErkJggg=="
};
;
///<jscompress sourcefile="gameplay.js" />
var GamePlay = function () {
    function e() {
        this.clientStats = new ClientStats, this.kmxControl = new KMXControl(this, document.getElementById("webrtcVideoEle"), !0), this.inputDevice = 1, this.pc = null, this.firstdatachannel = !0, this.dcReliable = null, this.dcUnreliable = null, this.localSdp = "", this.remoteSdp = "", this.gameRunning = !1, this.gameStarted = !1, this.encSettingsRecved = !1, this.audioBufSize = 131072, this.audioBuf = new Uint8Array(this.audioBufSize), this.videoBufSize = 131072, this.videoBuf = new Uint8Array(this.videoBufSize), this.sendBufSize = 20480, this.sendBuf = new Uint8Array(this.sendBufSize), this.recvBufSize = 16384, this.recvBuf = new Uint8Array(this.recvBufSize), this.videoFrameCount = 0, this.generalGsProxy = "default", this.isFFGsProxy = !1, this.aacAudioPlayer = null, this.requestParams = new GlobalUrlSearch, this.broadcastChannel = new BroadcastChannel("gloudwebrtc"), this.gsInfo = null, this.userSetVideoBitrate = 6e3, this.videoBitrateMaxLimit = 9e3, this.videoBitrateMinLimit = 1e3;
        let e = {};
        e.image_width = 1280, e.image_height = 720, e.video_bit_rate = 4096, e.video_max_bit_rate = 4096, e.video_fps = 30, e.profile = "BASELINE", e.video_codec_type = 1, e.video_codecs = 1, e.min_key_frame = 1, e.max_key_frame = 125, e.audio_codec_type = 2, e.audio_bit_rate = 48, e.audio_sample_rate = 44100, e.video_gop = 999999, parseInt(this.requestParams.gop) > 0 && (e.video_gop = parseInt(this.requestParams.gop)), e.bitrate_ctl = "CBR", e.enc_format = "STREAM_ENC_FORMAT_H264", this.mediaSettings = e, this.wasmLoaded = !1, this.webrtcConnected = !1, this.webrtcStatsTimer = null, this.lastAllStats = {}, this.lastLossOrIncreaseFlag = performance.now(), this.lastDecreaseFlag = performance.now(), this.initWasm = function (e) {
            WebAssembly.instantiateStreaming || (WebAssembly.instantiateStreaming = (async(e, t) = > {
                    const i = await(await
                    e).arrayBuffer();
            return await
            WebAssembly.instantiate(i, t)
        }))
            ;
            const t = new Go;
            WebAssembly.instantiateStreaming(fetch(e), t.importObject).then(e = > {t.run(e.instance), this.wasmLoaded = !0, this.isFFGsProxy ? this.sendHelloToGsProxy() : this.connectGS()
        }).
            catch(e = > {console.error(e), alert("Wasm初始化失败！" + e)
        })
        }, this.sendHelloToGsProxy = function () {
            if (!(this.wasmLoaded && this.pc && this.dcReliable && "open" === this.dcReliable.readyState))return void console.log("sendHelloToGsProxy is not ready");
            console.log("sendHelloToGsProxy is ready");
            let e = {};
            "" !== this.generalGsProxy && (e.gs_ip = '"' + this.gsInfo.gs_ip + '"', e.gs_tcp_port = parseInt(this.gsInfo.gs_tcp_port)), this.dcReliable.send(JSON.stringify(e))
        }, this.specialStartForWebrtc = function (e) {
            console.log("specialStartForWebrtc:" + e), window.setTimeout(() = > {GoSendAvcSwitch(1, 1, 1
            ),
            GoSendRequestIFrame()
        },
            2e3
            ),
            window.setTimeout(() = > {GoSendRequestIFrame()}, 4e3
            ),
            window.setTimeout(() = > {GoSendRequestIFrame()}, 6e3
            ),
            window.setTimeout(() = > {GoSendRequestIFrame()}, 1e4
            )
        }, this.gotLocalSdp = function (e) {
            this.localSdp = btoa(JSON.stringify(e)), this.exchangeSdpThroughGls()
        }, this.exchangeSdpThroughGls = function () {
            console.log("exchangeSdpThroughGls");
            let e = localStorage.getItem("deviceInfo");
            if (!e)return void(this.requestParams.directgs || alert("设备信息为空！"));
            let t = JSON.parse(e), i = {};
            if (i.device_id = t.device_uuid, i.gsm_token = "", i.login_token = t.login_token, i.client_sdp = '"' + this.localSdp + '"', "default" === this.generalGsProxy)i.gsproxy_addr = '"' + this.gsInfo.gs_ip + '"', i.gsproxy_http_port = 9050; else if ("" !== this.generalGsProxy) {
                let e = new URL(this.generalGsProxy);
                i.gsproxy_addr = '"' + e.hostname + '"', i.gsproxy_http_port = parseInt(e.port)
            }
            xhr = new XMLHttpRequest;
            let n = "";
            if ("http:" === location.protocol) {
                let e = "http://" + i.gsproxy_addr + ":" + i.gsproxy_http_port + "/gls/webrtc_setup";
                n = e = (e = e.replace('"', "")).replace('"', "")
            } else if (this.generalGsProxy.indexOf("51ias.com") > 0) {
                let e = "https://" + i.gsproxy_addr + ":" + i.gsproxy_http_port + "/gls/webrtc_setup";
                n = e = (e = e.replace('"', "")).replace('"', "")
            } else n = "https://gls.51ias.com:8002/client/webrtc_setup";
            xhr.open("POST", n), xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded"), xhr.onload = function () {
                if (200 === xhr.status) {
                    let e = JSON.parse(xhr.responseText);
                    if (e.ret && 0 === e.ret.result && "" !== e.gsproxy_sdp)return console.log("got sdp from gls/gsproxy http api."), this.isFFGsProxy = !0, this.remoteSdp = e.gsproxy_sdp, void this.setRemoteSdp();
                    e.ret && 0 !== e.ret.result && e.ret.result_msg.indexOf("404") < 0 && alert("从GLS获取服务器的webrtc连接信息失败！")
                }
                console.log("无法获取服务器的webrtc连接信息！" + xhr.responseText)
            }.bind(this), xhr.send("content=" + encodeURIComponent(JSON.stringify(i)))
        }, this.initWebrtc = function () {
            let e = new (window.RTCPeerConnection || window.mozRTCPeerConnection || window.webkitRTCPeerConnection)({sdpSemantics: "unified-plan"});
            e.ontrack = function (e) {
                console.log("ontrack: " + e.track.kind), "video" === e.track.kind && (document.getElementById("webrtcVideoEle").srcObject = e.streams[0], this.isFFGsProxy || this.specialStartForWebrtc("ontrack old chrome"))
            }.bind(this), e.oniceconnectionstatechange = function () {
                console.log("oniceconnectionstatechange: " + e.iceConnectionState), "failed" === e.iceConnectionState || "disconnected" === e.iceConnectionState || "closed" === e.iceConnectionState ? ("failed" === e.iceConnectionState && !0 === this.webrtcConnected && alert("与服务器的连接断开"), this.webrtcConnected = !1) : "connected" !== e.iceConnectionState && "completed" !== e.iceConnectionState || (this.webrtcConnected = !0)
            }.bind(this), e.onicegatheringstatechange = function (t) {
                console.log("onicegatheringstatechange, pc.iceGatheringState is " + e.iceGatheringState)
            }.bind(this), e.onsignalingstatechange = function (t) {
                console.log("onsignalingstatechange, pc.signalingstate is " + e.signalingState)
            }, e.onicecandidate = function (e) {
                e.candidate && console.log("onicecandidate: " + e.candidate.candidate)
            }.bind(this), e.onconnectionstatechange = function () {
                switch (console.log("onconnectionstatechange " + e.connectionState), e.connectionState) {
                    case"connected":
                        this.webrtcConnected = !0, this.isFFGsProxy || this.specialStartForWebrtc("peer connected. half gs proxy.");
                        break;
                    case"disconnected":
                    case"failed":
                        !0 === this.webrtcConnected && alert("与服务器的连接断开"), this.webrtcConnected = !1;
                        break;
                    case"closed":
                        this.webrtcConnected = !1
                }
            }.bind(this), this.initDataChannel(e, !1), e.ondatachannel = function (e) {
                console.log("Data channel is created!"), e.channel.onopen = function () {
                    console.log("Data channel is open and ready to be used.")
                }
            }, e.onstatsended = function (e) {
                console.log("onstatsended: " + e)
            }, void 0 !== e.addTransceiver ? (e.addTransceiver("video", {direction: "sendrecv"}), e.addTransceiver("audio", {direction: "sendrecv"}), e.createOffer().then(function (t) {
                return this.gotLocalSdp(t), e.setLocalDescription(t)
            }.bind(this)).catch(e = > alert(e))
            ):
            e.createOffer({offerToReceiveAudio: !0, offerToReceiveVideo: !0}).then(function (t) {
                return this.gotLocalSdp(t), e.setLocalDescription(t)
            }.bind(this)).catch(e = > alert(e)
            ),
            this.broadcastChannel.onmessage = function (e) {
                console.log(e), "message" === e.type && "UserQuitGame" === e.data && (GoSendOffline(1, 0), window.close())
            }.bind(this), this.pc = e
        }, this.getGsInfo = function () {
            let e = localStorage.getItem("gsInfo"), t = localStorage.getItem("gsInfoExpireTime"), i = localStorage.getItem("deviceInfo");
            if ((!t || t <= Date.now() / 1e3 + 3) && console.log("分配的服务器可能已经过期！"), this.requestParams.directgs) {
                let t = {};
                t.region_id = 27, t.gsm_id = 1, t.gs_id = 27001003, t.gs_ip = this.requestParams.directgs, t.gs_tcp_port = 9e3, t.gs_udp_port = 0, t.gsm_token = "", t.is_left_over = 0, t.vip_wait_timeout = 80, t.nonvip_wait_timeout = 20, t.svip_wait_timeout = 120, t.game_id = 1e6, t.game_mode = "ENUM_GAMEMODE_SINGLE_PLAYER_NO_SAVE", this.requestParams.multi && (t.game_mode = "ENUM_GAMEMODE_MULTI_PLAYER_NO_SAVE"), t.payment_type = "SUBSCRIPTION", t.save_id = 0, t.serial_id = 0, t.input_device = "KEYBOARDANDMOUSE", t.gls_time_stat_id = 0, t.short_game_name = "闪克", t.game_name = "闪克", e = JSON.stringify(t);
                let n = {};
                n.account_id = "20", n.device_uuid = '"hex-test2"', n.login_token = '"hex-test2"', n.op_token = '""', this.requestParams.account_id && (n.account_id = this.requestParams.account_id, n.device_uuid = '"hex-test' + n.account_id + '"'), i = JSON.stringify(n)
            }
            localStorage.setItem("deviceInfoStr", i), this.gsInfo = JSON.parse(e), this.gsInfo || alert("服务器信息为空！")
        }, this.connectGS = function () {
            if (!this.localSdp)return void alert("生成webrtc所需的SDP失败，建议升级到最新的Chrome。");
            if (!this.wasmLoaded)return void alert("wasm加载失败，建议升级到最新的Chrome。");
            this.gameStarted = !1, this.encSettingsRecved = !1, this.gameRunning = !1, this.gameStarted = !1, this.lastAllStats = {};
            let e = {};
            e.sdp = this.localSdp;
            let t = JSON.stringify(e), i = JSON.stringify(this.mediaSettings);
            "https:" === location.protocol && (this.generalGsProxy = this.generalGsProxy.replace("ws://", "wss://"));
            let n = JSON.stringify(this.gsInfo), s = localStorage.getItem("deviceInfoStr");
            console.log(GoConnectGs(0, this.audioBuf, this.audioBufSize, this.videoBuf, this.videoBufSize, n, s, i, t, this.generalGsProxy, this.sendBuf, this.sendBufSize, this.recvBuf, this.recvBufSize, this.isFFGsProxy ? 1 : 0, this.inputDevice))
        }, this.setRemoteSdp = function (e) {
            if (this.remoteSdp && (this.encSettingsRecved || this.isFFGsProxy))try {
                let t = JSON.parse(atob(this.remoteSdp));
                this.pc.setRemoteDescription(new RTCSessionDescription(t)).then(() = > {e && e()
            }),
                this.remoteSdp = ""
            } catch (e) {
                alert("WebRTC建立连接失败！" + e)
            } else console.log("there is no sdp to set: " + this.remoteSdp)
        }, this.calcREMB = function (e, t, i, n, s) {
            (e > 0 || t > 0) && (this.lastLossOrIncreaseFlag = performance.now());
            let o = n;
            return e > 3 ? performance.now() - this.lastDecreaseFlag > 1e4 && (this.lastDecreaseFlag = performance.now(), o = parseInt(Math.max(this.videoBitrateMinLimit, 1 * n / 5))) : e > 0 ? performance.now() - this.lastDecreaseFlag > 5e3 && (this.lastDecreaseFlag = performance.now(), o = parseInt(Math.max(this.videoBitrateMinLimit, .93 * n))) : t <= 0 && performance.now() - this.lastLossOrIncreaseFlag > 1e4 && i > .5 * n && (this.lastLossOrIncreaseFlag = performance.now(), o = parseInt(Math.min(this.videoBitrateMaxLimit, 1.08 * n))), o
        }, this.initDataChannel = function (e, t) {
            !t || this.webrtcConnected ? (this.dcReliable = e.createDataChannel("ggp-tcp-like", {ordered: !0}), this.dcUnreliable = e.createDataChannel("ggp-udp-like", {
                ordered: !1,
                maxRetransmits: 0
            }), this.dcReliable.onopen = function () {
                console.log("data channel is open"), this.isFFGsProxy && this.firstdatachannel && (this.sendHelloToGsProxy(), this.firstdatachannel = !1)
            }.bind(this), this.dcReliable.onerror = function (e) {
                console.log("data channel error: " + e.message)
            }.bind(this), this.dcReliable.onclose = function () {
                console.log("data channel is closed"), this.initDataChannel(this.pc, !0)
            }.bind(this), this.dcReliable.onmessage = function (e) {
                if ("string" == typeof e.data)console.log("dataChannel msg: " + e.data), this.connectGS(); else {
                    let t = 0, i = this.recvBufSize;
                    for (; ;) {
                        let n = e.data.byteLength;
                        if (n - t >= i && (n = t + i), this.recvBuf.set(new Uint8Array(e.data.slice(t, n))), GoOnGsMsg(n - t), !(n - t >= i))break;
                        t += i
                    }
                }
            }.bind(this), window.setInterval(function () {
                return this.dcReliable && "closed" === this.dcReliable.readyState && this.initDataChannel(this.pc, !0), !0
            }.bind(this), 5e3)) : console.log("peer is not connected. can not create datachannel.")
        }, window.OnConnectGsFail = function (e, t, i) {
            if (console.log("OnConnectGsFail: " + e + " " + i + " " + t), alert("连接服务器失败：" + i), this.kmxControl.unlockMouse(), 1 === e) {
                let e = {};
                e.type = "GsOnlineResult", e.data = {}, e.data.resultCode = 2, e.data.regionId = this.gsInfo ? this.gsInfo.region_id : 0, e.data.gsId = this.gsInfo ? this.gsInfo.gs_id : 0, e.data.onlineResJson = "{}", this.broadcastChannel.postMessage(e)
            }
        }.bind(this), window.OnConnectGsSuccess = function () {
            console.log("OnConnectGsSuccess")
        }.bind(this), window.OnGsDisconnected = function (e, t) {
            this.isFFGsProxy && this.pc.close(), this.kmxControl.unlockMouse(), this.gameRunning = !1, console.log("OnGsDisconnected:" + t + " " + e), alert("与服务器连接断开。")
        }.bind(this), window.OnSendGsMsg = function (e, t) {
            try {
                this.dcReliable && "open" === this.dcReliable.readyState ? this.dcReliable.send(this.sendBuf.subarray(0, e)) : 1 !== t && this.dcUnreliable && "open" === this.dcUnreliable.readyState ? this.dcUnreliable.send(this.sendBuf.subarray(0, e)) : console.log("datachannel is not ready. " + t + " " + this.dcReliable.readyState + " " + this.dcUnreliable.readyState)
            } catch (e) {
                console.log("OnSendGsMsg error: " + e.stack)
            }
        }.bind(this), window.OnGsOnlineSteps = function (e, t) {
            console.log("OnGsOnlineSteps " + e + " " + t), window.onlineStepsMsgs[e] && window.loadingTips && window.loadingTips(window.onlineStepsMsgs[e])
        }.bind(this), window.OnGsOnlineResult = function (e, t) {
            try {
                console.log("gs online result. " + e);
                let i = JSON.parse(e);
                if (!i)return console.log("wrong ClientOnline response:" + e), void alert("登录服务器的返回信息错误！");
                let n = {};
                if (n.type = "GsOnlineResult", n.data = {}, "NO_ERR" === i.error_code) {
                    this.gameRunning = !0;
                    let e = localStorage.getItem("deviceInfo"), s = JSON.parse(e);
                    n.data.device_uuid = s.device_uuid, n.data.resultCode = 0;
                    let o = JSON.parse(t);
                    o && (console.log("media settings from gs: " + t), this.mediaSettings = o), i.webrtc_data && i.webrtc_data.sdp ? this.remoteSdp = i.webrtc_data.sdp : this.isFFGsProxy ? this.specialStartForWebrtc("gs online.") : console.log("RemoteSDP信息为空，可能是服务器不支持WebRTC。")
                } else n.data.resultCode = 3;
                n.data.regionId = this.gsInfo.region_id, n.data.gsId = this.gsInfo.gs_id, n.data.onlineResJson = e, this.broadcastChannel.postMessage(n), "NO_ERR" !== i.error_code && ("VERIFY_FROM_WEB" === i.error_code ? alert("Web服务器拒绝：" + i.error_msg + "(" + i.web_verify_err + ")") : alert("登录服务器失败：" + window.clientOnlineFailMsgs[i.error_code]))
            } catch (e) {
                console.log("OnGsOnlineResult:" + e.stack)
            }
        }.bind(this), window.OnGsGameStarted = function () {
            console.log("游戏启动完毕"), this.kmxControl.init(), this.kmxControl.mouesEventCb = function (e, t, i, n, s, o) {
                this.wasmLoaded && this.gameStarted && GoSendMouseEvent(this.kmxControl.lockMode, e, t, i, n, s, o)
            }.bind(this), this.kmxControl.keyEventCb = function (e, t) {
                this.wasmLoaded && this.gameStarted && GoSendKeyEvent(e, t)
            }.bind(this), this.kmxControl.wheelEventCb = function (e) {
                this.wasmLoaded && this.gameStarted && GoSendWheelEvent(e)
            }.bind(this);
            try {
                _czc.push(["_trackEvent", "游戏", "进入游戏画面"]), console.log("友盟统计", "游戏", "进入游戏画面")
            } catch (e) {
                console.log("统计脚本失败")
            }
            this.gameStarted = !0
        }.bind(this), window.OnGsKicked = function (e, t) {
            try {
                this.kmxControl.unlockMouse(), console.log("OnGsKicked: " + t + e), this.webrtcConnected = !1, alert("服务器主动断开：" + window.gsKickMsgs[e])
            } catch (e) {
                console.log("OnGsKicked:" + e.stack)
            }
        }.bind(this), window.OnGsEncSettings = function () {
            this.encSettingsRecved = !0
        }.bind(this), window.OnGsXInput = function (e, t, i, n) {
            try {
                this.kmxControl && this.kmxControl.OnGsXInput(e, t, i, n)
            } catch (e) {
                console.log("OnGsXInput:" + e.stack)
            }
        }.bind(this), window.OnSendModifyMediaSettingsFail = function (e, t) {
            console.log("OnSendModifyMediaSettingsFail:" + e + " " + t)
        }.bind(this), window.OnAudio = function (e) {
            if (this.aacAudioPlayer) {
                let t = new Uint8Array(3 + e);
                t[0] = 3, t[1] = 204, t[2] = 1, t.set(this.audioBuf.subarray(0, e), 3), this.aacAudioPlayer.recieveData(t.buffer)
            }
        }.bind(this), window.OnVideo = function (e) {
            if (broadway) {
                var t = {};
                t.videoIndex = this.videoFrameCount++, broadway.avc.decode(this.videoBuf.subarray(0, e), t)
            }
        }.bind(this), window.OnCursor = function (e) {
            try {
                this.kmxControl && this.kmxControl.onCursor(e)
            } catch (e) {
                console.log("onCursor error: " + e.stack)
            }
        }.bind(this), window.sendTextInput = function (e, t) {
            e && (GoSendTextInput(e), t && (GoSendKeyEvent(13, 2), GoSendKeyEvent(13, 3)))
        }.bind(this)
    }

    return e.prototype = {
        initGamePlay: function () {
            this.getGsInfo(), this.requestParams.gsproxy && ("default" === this.requestParams.gsproxy ? this.generalGsProxy = "default" : this.generalGsProxy = "ws://" + this.requestParams.gsproxy + "/gsproxy");
            let e = null;
            if ("http:" === location.protocol) {
                let t = localStorage.getItem("region_" + this.gsInfo.region_id);
                t && ((e = JSON.parse(t)) || console.log("测速数据为空！"))
            } else this.isFFGsProxy = !0;
            JSON.parse(window.localStorage.getItem("gsInfo")).game_id < 1e4 ? (this.mediaSettings.image_width = 1280, this.mediaSettings.image_height = 720, this.mediaSettings.video_fps = 30, this.mediaSettings.video_bit_rate = 6e3) : (this.mediaSettings.image_width = 1920, this.mediaSettings.image_height = 1080, this.mediaSettings.video_fps = 60, this.mediaSettings.video_bit_rate = 9e3), this.mediaSettings.video_max_bit_rate = parseInt(1.1 * this.mediaSettings.video_bit_rate), this.mediaSettings.profile = "MAIN", e && (this.mediaSettings.video_bit_rate = parseInt(Math.min(.8 * e.kbps, 9e3)), this.mediaSettings.video_max_bit_rate = parseInt(1.1 * this.mediaSettings.video_bit_rate)), this.initWebrtc(), this.initWasm(location.protocol + "//www.gloud.cn/pubilc/wasm/gloud_client_20200409.wasm"), document.addEventListener("visibilitychange", function () {
                console.log("game tab visible:" + !document.hidden), this.webrtcConnected && (document.hidden ? GoSendAvcSwitch(1, 0, 1) : (GoSendAvcSwitch(1, 1, 1), GoSendRequestIFrame()))
            }.bind(this))
        }, createAACPlayer: function () {
            if (!this.aacAudioPlayer) {
                if (this.aacAudioPlayer = new WebAudioDevice, !this.aacAudioPlayer.canReCreate())return;
                this.aacAudioPlayer.reCreate()
            }
        }, autoBitrate: function () {
            this.userSetVideoBitrate = 9e3
        }, modifyMediaSettings: function (e, t, i, n, s=!0, o=7500, a=1200) {
            s && (this.userSetVideoBitrate = n, this.videoBitrateMaxLimit = o, this.videoBitrateMinLimit = a), e > 0 && t > 0 && (this.mediaSettings.image_width = parseInt(e), this.mediaSettings.image_height = parseInt(t)), i > 1 && i <= 60 && (this.mediaSettings.video_fps = parseInt(i)), n >= 500 && n <= 3e4 && (this.mediaSettings.video_bit_rate = parseInt(n), this.mediaSettings.video_max_bit_rate = parseInt(1.1 * n));
            let r = JSON.stringify(this.mediaSettings);
            GoSendModifyMediaSettings(r)
        }, setWebRtcStatsCallback: function (e, t, i) {
            gamePlay.pc && (this.webrtcStatsTimer && (clearInterval(this.webrtcStatsTimer), this.lastAllStats = {}, this.lastLossOrIncreaseFlag = performance.now(), this.lastDecreaseFlag = performance.now()), this.webrtcStatsTimer = window.setInterval(function () {
                gamePlay.pc.getStats().then(e = > {let n = {};
                n.jitterBufferDelay = n.jitterBufferEmittedCount = 0, n.keyFramesDecoded = n.framesDecoded = n.framesDropped = n.framesBufferedGloud = 0, n.packetsLost = n.pliCount = n.nackCount = n.packetsReceived = n.currentRoundTripTime = n.bytesSent = n.bytesReceived = 0, e.forEach(e = > {"track" === e.type && "audio" === e.kind || ("track" === e.type && "video" === e.kind ? (n.frameHeight = e.frameHeight, n.frameWidth = e.frameWidth, n.framesDecoded += e.framesDecoded, n.framesDropped += e.framesDropped, n.framesBufferedGloud += e.framesReceived - e.framesDecoded - e.framesDropped) : "inbound-rtp" === e.type && "audio" === e.kind || "ssrc" === e.type && "audio" === e.mediaType || ("inbound-rtp" === e.type && "video" === e.kind || "ssrc" === e.type && "video" === e.mediaType ? (n.packetsLost += e.packetsLost, n.nackCount += e.nackCount, n.pliCount += e.pliCount, n.packetsReceived += e.packetsReceived, n.keyFramesDecoded += e.keyFramesDecoded, e.googFrameHeightReceived && (n.frameHeight = e.googFrameHeightReceived), e.googFrameWidthReceived && (n.frameWidth = e.googFrameWidthReceived), e.googNacksSent && (n.nackCount = e.googNacksSent, n.pliCount = e.googPlisSent)) : "candidate-pair" === e.type || "googCandidatePair" === e.type ? (n.currentRoundTripTime += e.currentRoundTripTime, n.bytesReceived += e.bytesReceived, n.bytesSent += e.bytesSent, e.googRtt && (n.currentRoundTripTime += e.googRtt)) : e.type))
            })
                ;
                let s = gamePlay.lastAllStats, o = 0;
                if (s.timestamp && (o = performance.now() - s.timestamp), n.timestamp = performance.now(), n.bitRateGloud = n.fpsGloud = n.framesDroppedGloud = n.jitterBufferMsGloud = n.packetsLostGloud = n.nackCountGloud = n.pliCountGloud = 0, s.bytesReceived > 0 && o && (n.bitRateGloud = parseInt((n.bytesReceived - s.bytesReceived) / o * 8)), s.framesDecoded > 0 && o && (n.fpsGloud = parseInt((n.framesDecoded - s.framesDecoded) / o * 1e3)), s.framesDropped > 0 && (n.framesDroppedGloud = n.framesDropped - s.framesDropped), s.jitterBufferDelay > 0 && (n.jitterBufferMsGloud = parseInt((n.jitterBufferDelay - s.jitterBufferDelay) / (n.jitterBufferEmittedCount - s.jitterBufferEmittedCount) * 1e3)), s.packetsLost > 0 && (n.packetsLostGloud = n.packetsLost - s.packetsLost), s.nackCount > 0 && (n.nackCountGloud = n.nackCount - s.nackCount), s.pliCount > 0 && (n.pliCountGloud = n.pliCount - s.pliCount), gamePlay.lastAllStats = n, gamePlay.clientStats.updateStat(n), n.bitRateGloud > 100 && 0 === n.fpsGloud && !document.hidden) {
                    GoSendRequestIFrame();
                    JSON.parse(window.localStorage.getItem("gsInfo")).game_id < 1e4 && gamePlay.modifyMediaSettings(0, 0, 0, 6e3, !1)
                }
                gamePlay.webrtcConnected && (n.recommentBitRate = gamePlay.calcREMB(n.packetsLostGloud, n.nackCountGloud, n.bitRateGloud, gamePlay.mediaSettings.video_bit_rate, n.currentRoundTripTime), !0 === i && gamePlay.wasmLoaded && n.recommentBitRate > 0 && n.recommentBitRate != gamePlay.mediaSettings.video_bit_rate && gamePlay.modifyMediaSettings(0, 0, 0, n.recommentBitRate, !1)), t && t(n)
            })
            }, e))
        }, changeMoveRatio: function (e) {
            this.kmxControl.moveRatio = e
        }
    }, e
}();
;
///<jscompress sourcefile="kmxcontrol.js" />
"use strict";
var KMXControl = function () {
    function e(e, t, o) {
        this.gamePlay = e, this.gamepads = {}, this.reqAFId = -1, this.lockMode = o, this.mouseLocked = !1, this.firstKeyDownAfterLock = !0, this.KeyStatus = [!1, !1, !1], this.absX = 0, this.absY = 0, this.moveRatio = 1, this.videoWidthRatio = 1, this.videoHeightRatio = 1, this.targetEle = t, this.localCursor = document.getElementById("virtualMouse"), this.localCursorHidePosX = 0, this.localCursorHidePosY = 0, this.animatedCursorTimer = null, this.lastCursorStyle = "", this.noOperationTimer = 300, this.noOperationTimerAlert = document.getElementById("stay"), this.mouesEventCb = function (e, t, o, s, i, n) {
            console.log("default mouesEventCb")
        }, this.keyEventCb = function (e, t) {
            console.log("default keyEventCb")
        }, this.wheelEventCb = function (e) {
            console.log("default wheelEventCb")
        }, this.specialKeyMap = {
            Numpad0: 96,
            Numpad1: 97,
            Numpad2: 98,
            Numpad3: 99,
            Numpad4: 100,
            Numpad5: 101,
            Numpad6: 102,
            Numpad7: 103,
            Numpad8: 104,
            Numpad9: 105,
            NumpadMultiply: 106,
            NumpadAdd: 107,
            NumpadSeperator: 108,
            NumpadSubtract: 109,
            NumpadDecimal: 110,
            NumpadDivide: 111,
            ShiftLeft: 160,
            ShiftRight: 161,
            ControlLeft: 162,
            ControlRight: 163,
            AltLeft: 164,
            AltRight: 165,
            MetaLeft: 91,
            MeatRight: 92
        }, this.mouseButtonValue = function (e) {
            return e <= 2 ? e : -1
        }, this.stopEvent = function (e) {
            e.stopPropagation(), e.cancelable && e.preventDefault()
        };
        var s = function () {
            if (document.pointerLockElement === this.targetEle || document.mozPointerLockElement === this.targetEle || document.webkitPointerLockElement === this.targetEle) {
                console.log("指针锁定成功了。");
                try {
                    _czc.push(["_trackEvent", "游戏", "指针锁定"]), console.log("友盟统计", "游戏", "指针锁定")
                } catch (e) {
                    console.log("统计脚本失败")
                }
                window.GoSendRequestIFrame(), this.gamePlay.createAACPlayer(), document.getElementById("webrtcVideoEle").muted = !1, this.mouseLocked = !0, GoReleaseAllKeys(), this.targetEle.clientWidth > 0 && this.gamePlay.mediaSettings.image_width > 0 && (this.videoWidthRatio = this.targetEle.clientWidth / this.gamePlay.mediaSettings.image_width), this.targetEle.clientHeight > 0 && this.gamePlay.mediaSettings.image_height > 0 && (this.videoHeightRatio = this.targetEle.clientHeight / this.gamePlay.mediaSettings.image_height), document.getElementById("game_control") && (document.getElementById("game_control").style.display = "none"), document.getElementById("hideMode") && (document.getElementById("hideMode").style.display = "none")
            } else console.log("指针锁定已丢失。"), this.mouseLocked = !1, GoReleaseAllKeys(), document.getElementById("game_control") && (document.getElementById("game_control").style.display = "block"), document.getElementById("hideMode") && (document.getElementById("hideMode").style.display = "block")
        }.bind(this), i = function () {
            console.log("锁定指针时出错。"), this.mouseLocked = !1
        }.bind(this);
        document.addEventListener("pointerlockchange", s, !1), document.addEventListener("pointerlockerror", i, !1), document.addEventListener("mozpointerlockerror", i, !1), document.addEventListener("webkitpointerlockerror", i, !1), document.addEventListener("mozpointerlockchange", s, !1), document.addEventListener("webkitpointerlockchange", s, !1), this.showNoOperationTimerAlert = (() = > {this.noOperationTimerAlert.style.display = "block", this.noOperationTimerAlert.addEventListener("mousedown", this.hideNoOperationTimerAlert), this.noOperationTimerAlert.addEventListener("keydown", this.hideNoOperationTimerAlert)
    }),
        this.hideNoOperationTimerAlert = (() = > {this.noOperationTimerAlert.style.display = "none", this.noOperationTimer = 300, GoSendKeyEvent(0, 3)
    })
    }

    return e.prototype = {
        init: function () {
            setInterval(() = > {this.noOperationTimer--, 0 === this.noOperationTimer && this.showNoOperationTimerAlert()
        },
            1e3
            ),
            console.log("开始手柄的初始化"), window.addEventListener("gamepadconnected", function (e) {
                console.log("gamepadconnected. index:" + e.gamepad.index + " " + e.gamepad.id);
                try {
                    _czc.push(["_trackEvent", "手柄链接", "手柄链接"]), console.log("友盟统计", "手柄链接", "手柄链接")
                } catch (e) {
                    console.log("统计脚本失败")
                }
                this.gamepads[e.gamepad.index] = e.gamepad, !this.reqAFId <= 0 && (console.log("requestAnimationFrame"), this.reqAFId = window.requestAnimationFrame(this.updateGamepads))
            }.bind(this), !1), window.addEventListener("gamepaddisconnected", function (e) {
                console.log("gamepaddisconnected. index:" + e.gamepad.index + " " + e.gamepad.id), delete this.gamepads[e.gamepad.index];
                var t = 0;
                for (let e in this.gamepads)t++;
                !t && this.reqAFId && (console.log("cancelAnimationFrame"), window.cancelAnimationFrame(this.reqAFId), this.reqAFId = -1)
            }.bind(this), !1), this.updateGamepads = function () {
                this.noOperationTimer <= 5 && (this.noOperationTimer = 300);
                var e = navigator.getGamepads ? navigator.getGamepads() : navigator.webkitGetGamepads ? navigator.webkitGetGamepads() : [];
                for (let t = 0; t < e.length; t++)e[t] && (e[t].index, this.gamepads, this.gamepads[e[t].index] = e[t]);
                for (let e in this.gamepads) {
                    var t = this.gamepads[e];
                    if (t && t.id) {
                        var o = 0, s = 0, i = 0;
                        t.buttons.length >= 10 && (o |= t.buttons[0].pressed ? 4096 : 0, o |= t.buttons[1].pressed ? 8192 : 0, o |= t.buttons[2].pressed ? 16384 : 0, o |= t.buttons[3].pressed ? 32768 : 0, o |= t.buttons[4].pressed ? 256 : 0, o |= t.buttons[5].pressed ? 512 : 0, s = t.buttons[6].pressed ? parseInt(255 * t.buttons[6].value) : 0, i = t.buttons[7].pressed ? parseInt(255 * t.buttons[7].value) : 0, o |= t.buttons[8].pressed ? 32 : 0, o |= t.buttons[9].pressed ? 16 : 0), t.buttons.length >= 16 && (o |= t.buttons[10].pressed ? 64 : 0, o |= t.buttons[11].pressed ? 128 : 0, o |= t.buttons[12].pressed ? 1 : 0, o |= t.buttons[13].pressed ? 2 : 0, o |= t.buttons[14].pressed ? 4 : 0, o |= t.buttons[15].pressed ? 8 : 0), t.buttons.length;
                        for (var n, a, r, l, d = 0; d < t.axes.length; d++) {
                            var h = t.axes[d];
                            switch (h > -.15 && h < .15 && (h = 0), h *= 32767, d) {
                                case 0:
                                    n = h;
                                    break;
                                case 1:
                                    a = -h;
                                    break;
                                case 2:
                                    r = h;
                                    break;
                                case 3:
                                    l = -h
                            }
                        }
                        GoSendXInputEvent(e, parseInt(o), parseInt(s), parseInt(i), parseInt(n), parseInt(a), parseInt(r), parseInt(l))
                    }
                }
                this.reqAFId = window.requestAnimationFrame(this.updateGamepads)
            }.bind(this), this.targetEle.onmousedown = function (e) {
                "block" === this.noOperationTimerAlert.style.display && this.hideNoOperationTimerAlert(), this.noOperationTimer = 300;
                let t = this.mouseButtonValue(e.button);
                t >= 0 && (this.lockMode ? this.mouseLocked && this.mouesEventCb(t, 2, this.absX, this.absY, parseInt(this.localCursor.offsetLeft / this.videoWidthRatio), parseInt(this.localCursor.offsetTop / this.videoHeightRatio)) : this.mouesEventCb(t, 2, e.offsetX, e.offsetY, e.offsetX, e.offsetY)), this.stopEvent(e)
            }.bind(this), this.targetEle.onmousemove = function (e) {
                if (this.lockMode) {
                    if (this.mouseLocked) {
                        "block" === this.noOperationTimerAlert.style.display && this.hideNoOperationTimerAlert(), this.noOperationTimer = 300, this.absX += parseInt(e.movementX * this.moveRatio), this.absY += parseInt(e.movementY * this.moveRatio);
                        let r = 0, l = 0;
                        if ("block" === this.localCursor.style.display) {
                            let d = e.movementX * this.videoWidthRatio * this.moveRatio, h = e.movementY * this.videoHeightRatio * this.moveRatio;
                            var t = this.targetEle.clientWidth, o = this.targetEle.clientHeight, s = this.localCursor.offsetLeft, i = this.localCursor.offsetTop, n = s + d, a = i + h;
                            r = n >= t ? t : n <= 0 ? 0 : s + d, l = a >= o ? o : a <= 0 ? 0 : i + h, this.localCursor.style.left = r + "px", this.localCursor.style.top = l + "px", this.localCursorHidePosX = r, this.localCursorHidePosY = l
                        }
                        this.mouesEventCb(4, 1, this.absX, this.absY, parseInt(r / this.videoWidthRatio), parseInt(l / this.videoHeightRatio))
                    }
                } else this.mouesEventCb(4, 1, e.offsetX, e.offsetY, e.offsetX, e.offsetY);
                this.stopEvent(e)
            }.bind(this), document.getElementById("hideMode") && (document.getElementById("hideMode").onmouseup = (() = > {this.targetEle.onmouseup(event)
        })),
            this.targetEle.onmouseup = function (e) {
                let t = this.mouseButtonValue(e.button);
                t >= 0 ? this.lockMode && (this.mouseLocked ? this.mouesEventCb(e.button, 3, this.absX, this.absY, parseInt(this.localCursor.offsetLeft / this.videoWidthRatio), parseInt(this.localCursor.offsetTop / this.videoHeightRatio)) : 0 !== t && 2 !== t || !this.gamePlay.gameRunning || (this.targetEle.requestPointerLock = this.targetEle.requestPointerLock || this.targetEle.mozRequestPointerLock || this.targetEle.webkitRequestPointerLock || this.targetEle.oRequestPointerLock || this.targetEle.msRequestPointerLock, this.targetEle.requestPointerLock(), this.keyEventCb(20, e.getModifierState("CapsLock") ? 5 : 4), this.keyEventCb(144, e.getModifierState("NumLock") ? 5 : 4), this.keyEventCb(145, e.getModifierState("ScrollLock") ? 5 : 4), console.log(e.getModifierState("CapsLock"), e.getModifierState("NumLock"), e.getModifierState("ScrollLock")), this.localCursor.style.left = e.offsetX + "px", this.localCursor.style.top = e.offsetY + "px")) : this.mouesEventCb(t, 3, e.offsetX, e.offsetY, e.offsetX, e.offsetY), this.stopEvent(e)
            }.bind(this), this.targetEle.onwheel = function (e) {
                let t = 0;
                e.deltaY > 0 ? t = -1 : e.deltaY < 0 && (t = 1), this.lockMode ? this.mouseLocked && this.wheelEventCb(t) : this.wheelEventCb(t), this.stopEvent(e)
            }.bind(this), document.onkeydown = function (e) {
                if ("block" === this.noOperationTimerAlert.style.display && this.hideNoOperationTimerAlert(), !this.lockMode || this.mouseLocked || 27 == e.keyCode) {
                    this.noOperationTimer = 300;
                    let t = e.keyCode;
                    this.specialKeyMap[e.code] && (t = this.specialKeyMap[e.code]), this.keyEventCb(t, 2), this.stopEvent(e)
                }
            }.bind(this), document.onkeyup = function (e) {
                if (!this.lockMode || this.mouseLocked || 27 == e.keyCode) {
                    let t = e.keyCode;
                    this.specialKeyMap[e.code] && (t = this.specialKeyMap[e.code]), this.keyEventCb(t, 3), this.stopEvent(e)
                }
            }.bind(this), this.targetEle.addEventListener("focusin", function () {
                console.log("target focus in")
            }.bind(this)), this.targetEle.addEventListener("focusout", function () {
                console.log("target focus out")
            }.bind(this)), document.addEventListener("fullscreenchange", function (e) {
                document.fullscreenElement || document.mozFullScreenElement || document.webkitFullscreenElement ? (console.log("进入全屏"), this.targetEle.requestPointerLock = this.targetEle.requestPointerLock || this.targetEle.mozRequestPointerLock || this.targetEle.webkitRequestPointerLock || this.targetEle.oRequestPointerLock || this.targetEle.msRequestPointerLock, this.targetEle.requestPointerLock(), navigator.keyboard && navigator.keyboard.lock(), GoReleaseAllKeys(), document.getElementById("game_control").style.display = "none", document.getElementById("hideMode").style.display = "none", document.getElementById("fullScreenImg").src = "https://d2.51ias.com/public/images/gloud.cn/exitfullScreen.png", document.getElementById("fullScreenText").innerText = "退出全屏") : (console.log("退出全屏"), GoReleaseAllKeys(), document.getElementById("game_control").style.display = "block", document.getElementById("hideMode").style.display = "block", document.getElementById("fullScreenImg").src = "https://d2.51ias.com/public/images/gloud.cn/fullScreen.png", document.getElementById("fullScreenText").innerText = "全屏模式", GoReleaseAllKeys())
            }.bind(this))
        }, OnGsXInput: function (e, t, o, s) {
            if (console.log("OnGsXInput. index:" + e + " left:" + o + " right:" + s), 1 === t) {
                if (this.gamepads[e] && this.gamepads[e].vibrationActuator)if (0 === o && 0 === s)this.gamepads[e].vibrationActuator.reset(); else {
                    let t = {startDelay: 0, duration: 200, strongMagnitude: 0, weakMagnitude: 1};
                    o > 1e4 || s > 1e4 ? (t.duration = 200, t.weakMagnitude = .5, t.strongMagnitude = .5) : (o > 3e4 || s > 3e4) && (t.duration = 300, t.weakMagnitude = 1, t.strongMagnitude = 1), this.gamepads[e].vibrationActuator.playEffect("dual-rumble", t)
                }
            } else console.log("unknown msgType: " + t)
        }, onCursor: function (e) {
            let t = JSON.parse(e);
            if (!0 !== t.show_or_hide && !1 !== t.show_or_hide || (console.log("cursor show: " + t.show_or_hide), t.show_or_hide ? (this.localCursor.style.left = this.localCursorHidePosX + "px", this.localCursor.style.top = this.localCursorHidePosY + "px", this.localCursor.style.display = "block") : this.localCursor.style.display = "none"), t.cursor_style) {
                if (this.lastCursorStyle === t.cursor_style && "CURSOR_CUSTOM" !== this.lastCursorStyle)return !1;
                this.lastCursorStyle = t.cursor_style, this.animatedCursorTimer && (clearInterval(this.animatedCursorTimer), this.animatedCursorTimer = null), t.cursor_width > 0 && (this.localCursor.style.width = t.cursor_width * this.videoWidthRatio + "px"), t.cursor_height > 0 && (this.localCursor.style.height = t.cursor_height * this.videoHeightRatio + "px");
                let e = "";
                switch (t.cursor_style) {
                    case"CURSOR_DEFAULT":
                        break;
                    case"CURSOR_CUSTOM":
                        t.game_cursor_data && !t.game_cursor_data.cursor_frames && (e = window.gloudCursors.CURSOR_IBEAM);
                        break;
                    case"CURSOR_IBEAM":
                        e = window.gloudCursors.CURSOR_IBEAM;
                        break;
                    default:
                        e = window.gloudCursors[t.cursor_style]
                }
                let o = function (e, t) {
                    e || (e = window.gloudCursors.CURSOR_ARROW), this.localCursor.style.background = "transparent url(data:image/png;base64," + e + ") no-repeat 0 0/contain", this.localCursor.style.transform = "translate(" + (0 - (t ? t.x : 0) * this.videoWidthRatio) + "px, " + (0 - (t ? t.y : 0) * this.videoHeightRatio) + "px)"
                }.bind(this);
                if (t.game_cursor_data.cursor_frames && t.game_cursor_data.cursor_frames.length > 0) {
                    let e = t.game_cursor_data.cursor_frames;
                    if (e.length > 0 && o(e[0].frame_data, e[0].cursor_hot_spot), e.length > 1) {
                        let s = 1;
                        this.animatedCursorTimer = window.setInterval(function () {
                            o(e[s].frame_data, e[s].cursor_hot_spot), ++s >= e.length && (s = 0)
                        }.bind(this), t.game_cursor_data.frame_rate)
                    }
                } else o(e, t.icon_cursor_hot_spot)
            }
        }, unlockMouse: function () {
            this.mouseLocked && (document.exitPointerLock = document.exitPointerLock || document.mozExitPointerLock || document.webkitExitPointerLock, document.exitPointerLock()), this.mouseLocked = !1, this.absX = 0, this.absY = 0
        }
    }, e
}();
;
///<jscompress sourcefile="QMCGAudioDecoder.js" />
Resampler = function () {
    "use strict";
    function t(t, e, r, i) {
        this.fromSampleRate = +t, this.toSampleRate = +e, this.channels = 0 | r, this.inputBufferLength = i, this.initialize()
    }

    return t.prototype.initialize = function () {
        if (!(this.fromSampleRate > 0 && this.toSampleRate > 0 && this.channels > 0))throw new Error("Invalid settings specified for the resampler.");
        if (this.fromSampleRate == this.toSampleRate)this.resampler = this.bypassResampler, this.ratioWeight = 1; else {
            this.ratioWeight = this.fromSampleRate / this.toSampleRate, this.fromSampleRate < this.toSampleRate ? (this.compileLinearInterpolationFunction(), this.lastWeight = 1) : (this.compileMultiTapFunction(), this.tailExists = !1, this.lastWeight = 0);
            var t = Math.ceil(this.inputBufferLength * this.toSampleRate / this.fromSampleRate / this.channels * 1.01) * this.channels + this.channels;
            this.outputBuffer = new Float32Array(t), this.lastOutput = new Float32Array(this.channels)
        }
    }, t.prototype.compileLinearInterpolationFunction = function () {
        for (var t = "var outputOffset = 0; var bufferLength = buffer.length; if (bufferLength > 0) { var weight = this.lastWeight; var firstWeight = 0; var secondWeight = 0; var sourceOffset = 0; var outputOffset = 0; var outputBuffer = this.outputBuffer; for (; weight < 1; weight += " + this.ratioWeight + ") { secondWeight = weight % 1; firstWeight = 1 - secondWeight;", e = 0; e < this.channels; ++e)t += "outputBuffer[outputOffset++] = (this.lastOutput[" + e + "] * firstWeight) + (buffer[" + e + "] * secondWeight);";
        t += "} weight -= 1; for (bufferLength -= " + this.channels + ", sourceOffset = Math.floor(weight) * " + this.channels + "; sourceOffset < bufferLength;) { secondWeight = weight % 1; firstWeight = 1 - secondWeight;";
        for (e = 0; e < this.channels; ++e)t += "outputBuffer[outputOffset++] = (buffer[sourceOffset" + (e > 0 ? " + " + e : "") + "] * firstWeight) + (buffer[sourceOffset + " + (this.channels + e) + "] * secondWeight);";
        t += "weight += " + this.ratioWeight + "; sourceOffset = Math.floor(weight) * " + this.channels + "; }";
        for (e = 0; e < this.channels; ++e)t += "this.lastOutput[" + e + "] = buffer[sourceOffset++];";
        t += "this.lastWeight = weight % 1; } return this.outputBuffer;", this.resampler = Function("buffer", t)
    }, t.prototype.compileMultiTapFunction = function () {
        for (var t = "var outputOffset = 0;var bufferLength = buffer.length;if (bufferLength > 0) {var weight = 0;", e = 0; e < this.channels; ++e)t += "var output" + e + " = 0;";
        for (t += "var actualPosition = 0;var amountToNext = 0;var alreadyProcessedTail = !this.tailExists;this.tailExists = false;var outputBuffer = this.outputBuffer;var currentPosition = 0;do {if (alreadyProcessedTail) {weight = " + this.ratioWeight + ";", e = 0; e < this.channels; ++e)t += "output" + e + " = 0;";
        for (t += "}else {weight = this.lastWeight;", e = 0; e < this.channels; ++e)t += "output" + e + " = this.lastOutput[" + e + "];";
        for (t += "alreadyProcessedTail = true; } while (weight > 0 && actualPosition < bufferLength) { amountToNext = 1 + actualPosition - currentPosition; if (weight >= amountToNext) {", e = 0; e < this.channels; ++e)t += "output" + e + " += buffer[actualPosition++] * amountToNext;";
        for (t += "currentPosition = actualPosition; weight -= amountToNext; }else {", e = 0; e < this.channels; ++e)t += "output" + e + " += buffer[actualPosition" + (e > 0 ? " + " + e : "") + "] * weight;";
        for (t += "currentPosition += weight;weight = 0;break;}}if (weight <= 0) {", e = 0; e < this.channels; ++e)t += "outputBuffer[outputOffset++] = output" + e + " / " + this.ratioWeight + ";";
        for (t += "}else {this.lastWeight = weight;", e = 0; e < this.channels; ++e)t += "this.lastOutput[" + e + "] = output" + e + ";";
        t += "this.tailExists = true;break;}} while (actualPosition < bufferLength);}return this.outputBuffer;", this.resampler = Function("buffer", t)
    }, t.prototype.bypassResampler = function (t) {
        return t
    }, t
}(), __bind = function (t, e) {
    return function () {
        return t.apply(e, arguments)
    }
}, __hasProp = {}.hasOwnProperty, __extends = function (t, e) {
    function r() {
        this.constructor = t
    }

    for (var i in e)__hasProp.call(e, i) && (t[i] = e[i]);
    return r.prototype = e.prototype, t.prototype = new r, t.__super__ = e.prototype, t
}, __indexOf = [].indexOf || function (t) {
        for (var e = 0, r = this.length; e < r; e++)if (e in this && this[e] === t)return e;
        return -1
    }, __slice = [].slice, UnderflowError = function (t) {
    function e() {
        e.__super__.constructor.apply(this, arguments), this.name = "UnderflowError", this.stack = (new Error).stack
    }

    return __extends(e, t), e
}(Error), Base = function () {
    function t() {
    }

    var e;
    return e = /\b_super\b/, t.extend = function (t) {
        var r, i, n, s, o, a;
        if (r = function (t) {
                function e() {
                    return e.__super__.constructor.apply(this, arguments)
                }

                return __extends(e, t), e
            }(this), "function" == typeof t) {
            s = Object.keys(r.prototype), t.call(r, r), t = {}, o = r.prototype;
            for (n in o)i = o[n], __indexOf.call(s, n) < 0 && (t[n] = i)
        }
        a = r.__super__;
        for (n in t)"function" == typeof(i = t[n]) && e.test(i) ? function (t, e) {
            r.prototype[t] = function () {
                var r, i;
                return i = this._super, this._super = a[t], r = e.apply(this, arguments), this._super = i, r
            }
        }(n, i) : r.prototype[n] = i;
        return r
    }, t
}(), EventEmitter = function (t) {
    function e() {
        return e.__super__.constructor.apply(this, arguments)
    }

    return __extends(e, t), e.prototype.on = function (t, e) {
        var r;
        return null == this.events && (this.events = {}), null == (r = this.events)[t] && (r[t] = []), this.events[t].push(e)
    }, e.prototype.off = function (t, e) {
        var r, i;
        if (null != (i = this.events) ? i[t] : void 0)return ~(r = this.events[t].indexOf(e)) ? this.events[t].splice(r, 1) : void 0
    }, e.prototype.once = function (t, e) {
        var r;
        return this.on(t, r = function () {
            return this.off(t, r), e.apply(this, arguments)
        })
    }, e.prototype.emit = function () {
        var t, e, r, i, n, s;
        if (e = arguments[0], t = 2 <= arguments.length ? __slice.call(arguments, 1) : [], null != (n = this.events) ? n[e] : void 0)for (r = 0, i = (s = this.events[e].slice()).length; r < i; r++)s[r].apply(this, t)
    }, e
}(Base), AVBuffer = function () {
    function t(e) {
        var r;
        if (e instanceof Uint8Array)this.data = e; else if (e instanceof ArrayBuffer || Array.isArray(e) || "number" == typeof e || (null != (r = global.Buffer) ? r.isBuffer(e) : void 0))this.data = new Uint8Array(e); else if (e.buffer instanceof ArrayBuffer)this.data = new Uint8Array(e.buffer, e.byteOffset, e.length * e.BYTES_PER_ELEMENT); else {
            if (!(e instanceof t))throw new Error("Constructing buffer with unknown type.");
            this.data = e.data
        }
        this.length = this.data.length, this.next = null, this.prev = null
    }

    return t.allocate = function (e) {
        return new t(e)
    }, t.prototype.copy = function () {
        return new t(new Uint8Array(this.data))
    }, t.prototype.slice = function (e, r) {
        return null == r && (r = this.length), new t(0 === e && r >= this.length ? this.data : this.data.subarray(e, e + r))
    }, t
}(), BufferList = function () {
    function t() {
        this.first = null, this.last = null, this.numBuffers = 0, this.availableBytes = 0, this.availableBuffers = 0
    }

    return t.prototype.copy = function () {
        var e;
        return e = new t, e.first = this.first, e.last = this.last, e.numBuffers = this.numBuffers, e.availableBytes = this.availableBytes, e.availableBuffers = this.availableBuffers, e
    }, t.prototype.append = function (t) {
        var e;
        return t.prev = this.last, null != (e = this.last) && (e.next = t), this.last = t, null == this.first && (this.first = t), this.availableBytes += t.length, this.availableBuffers++, this.numBuffers++
    }, t.prototype.advance = function () {
        return !!this.first && (this.availableBytes -= this.first.length, this.availableBuffers--, this.first = this.first.next, null != this.first)
    }, t.prototype.rewind = function () {
        var t;
        return !(this.first && !this.first.prev) && (this.first = (null != (t = this.first) ? t.prev : void 0) || this.last, this.first && (this.availableBytes += this.first.length, this.availableBuffers++), null != this.first)
    }, t.prototype.reset = function () {
        var t;
        for (t = []; this.rewind(););
        return t
    }, t
}(), Bitstream = function () {
    function t(t) {
        this.stream = t, this.bitPosition = 0
    }

    return t.prototype.copy = function () {
        var e;
        return e = new t(this.stream.copy()), e.bitPosition = this.bitPosition, e
    }, t.prototype.offset = function () {
        return 8 * this.stream.offset + this.bitPosition
    }, t.prototype.available = function (t) {
        return this.stream.available((t + 8 - this.bitPosition) / 8)
    }, t.prototype.advance = function (t) {
        var e;
        return e = this.bitPosition + t, this.stream.advance(e >> 3), this.bitPosition = 7 & e
    }, t.prototype.rewind = function (t) {
        var e;
        return e = this.bitPosition - t, this.stream.rewind(Math.abs(e >> 3)), this.bitPosition = 7 & e
    }, t.prototype.seek = function (t) {
        var e;
        return e = this.offset(), t > e ? this.advance(t - e) : t < e ? this.rewind(e - t) : void 0
    }, t.prototype.align = function () {
        if (0 !== this.bitPosition)return this.bitPosition = 0, this.stream.advance(1)
    }, t.prototype.read = function (t, e) {
        var r, i;
        if (0 === t)return 0;
        if ((i = t + this.bitPosition) <= 8)r = (this.stream.peekUInt8() << this.bitPosition & 255) >>> 8 - t; else if (i <= 16)r = (this.stream.peekUInt16() << this.bitPosition & 65535) >>> 16 - t; else if (i <= 24)r = (this.stream.peekUInt24() << this.bitPosition & 16777215) >>> 24 - t; else if (i <= 32)r = this.stream.peekUInt32() << this.bitPosition >>> 32 - t; else {
            if (!(i <= 40))throw new Error("Too many bits!");
            r = 4294967296 * this.stream.peekUInt8(0) + (this.stream.peekUInt8(1) << 24 >>> 0) + (this.stream.peekUInt8(2) << 16) + (this.stream.peekUInt8(3) << 8) + this.stream.peekUInt8(4), r %= Math.pow(2, 40 - this.bitPosition), r = Math.floor(r / Math.pow(2, 40 - this.bitPosition - t))
        }
        return e && (i < 32 ? r >>> t - 1 && (r = -1 * ((1 << t >>> 0) - r)) : r / Math.pow(2, t - 1) | 0 && (r = -1 * (Math.pow(2, t) - r))), this.advance(t), r
    }, t.prototype.peek = function (t, e) {
        var r, i;
        if (0 === t)return 0;
        if ((i = t + this.bitPosition) <= 8)r = (this.stream.peekUInt8() << this.bitPosition & 255) >>> 8 - t; else if (i <= 16)r = (this.stream.peekUInt16() << this.bitPosition & 65535) >>> 16 - t; else if (i <= 24)r = (this.stream.peekUInt24() << this.bitPosition & 16777215) >>> 24 - t; else if (i <= 32)r = this.stream.peekUInt32() << this.bitPosition >>> 32 - t; else {
            if (!(i <= 40))throw new Error("Too many bits!");
            r = 4294967296 * this.stream.peekUInt8(0) + (this.stream.peekUInt8(1) << 24 >>> 0) + (this.stream.peekUInt8(2) << 16) + (this.stream.peekUInt8(3) << 8) + this.stream.peekUInt8(4), r %= Math.pow(2, 40 - this.bitPosition), r = Math.floor(r / Math.pow(2, 40 - this.bitPosition - t))
        }
        return e && (i < 32 ? r >>> t - 1 && (r = -1 * ((1 << t >>> 0) - r)) : r / Math.pow(2, t - 1) | 0 && (r = -1 * (Math.pow(2, t) - r))), r
    }, t.prototype.readLSB = function (t, e) {
        var r, i;
        if (0 === t)return 0;
        if (t > 40)throw new Error("Too many bits!");
        return i = t + this.bitPosition, r = this.stream.peekUInt8(0) >>> this.bitPosition, i > 8 && (r |= this.stream.peekUInt8(1) << 8 - this.bitPosition), i > 16 && (r |= this.stream.peekUInt8(2) << 16 - this.bitPosition), i > 24 && (r += this.stream.peekUInt8(3) << 24 - this.bitPosition >>> 0), i > 32 && (r += this.stream.peekUInt8(4) * Math.pow(2, 32 - this.bitPosition)), i >= 32 ? r %= Math.pow(2, t) : r &= (1 << t) - 1, e && (i < 32 ? r >>> t - 1 && (r = -1 * ((1 << t >>> 0) - r)) : r / Math.pow(2, t - 1) | 0 && (r = -1 * (Math.pow(2, t) - r))), this.advance(t), r
    }, t.prototype.peekLSB = function (t, e) {
        var r, i;
        if (0 === t)return 0;
        if (t > 40)throw new Error("Too many bits!");
        return i = t + this.bitPosition, r = this.stream.peekUInt8(0) >>> this.bitPosition, i > 8 && (r |= this.stream.peekUInt8(1) << 8 - this.bitPosition), i > 16 && (r |= this.stream.peekUInt8(2) << 16 - this.bitPosition), i > 24 && (r += this.stream.peekUInt8(3) << 24 - this.bitPosition >>> 0), i > 32 && (r += this.stream.peekUInt8(4) * Math.pow(2, 32 - this.bitPosition)), i >= 32 ? r %= Math.pow(2, t) : r &= (1 << t) - 1, e && (i < 32 ? r >>> t - 1 && (r = -1 * ((1 << t >>> 0) - r)) : r / Math.pow(2, t - 1) | 0 && (r = -1 * (Math.pow(2, t) - r))), r
    }, t
}(), Stream = function () {
    function t(t) {
        this.list = t, this.localOffset = 0, this.offset = 0
    }

    var e, r, i, n, s, o, a, h, f, c, u, l, d;
    return e = new ArrayBuffer(16), d = new Uint8Array(e), f = new Int8Array(e), u = new Uint16Array(e), a = new Int16Array(e), l = new Uint32Array(e), h = new Int32Array(e), i = new Float32Array(e), "undefined" != typeof Float64Array && null !== Float64Array && (n = new Float64Array(e)), c = 13330 === new Uint16Array(new Uint8Array([18, 52]).buffer)[0], t.fromBuffer = function (e) {
        var r;
        return (r = new BufferList).append(e), new t(r)
    }, t.prototype.copy = function () {
        var e;
        return e = new t(this.list.copy()), e.localOffset = this.localOffset, e.offset = this.offset, e
    }, t.prototype.available = function (t) {
        return t <= this.list.availableBytes - this.localOffset
    }, t.prototype.remainingBytes = function () {
        return this.list.availableBytes - this.localOffset
    }, t.prototype.advance = function (t) {
        if (!this.available(t))throw new UnderflowError;
        for (this.localOffset += t, this.offset += t; this.list.first && this.localOffset >= this.list.first.length;)this.localOffset -= this.list.first.length, this.list.advance();
        return this
    }, t.prototype.rewind = function (t) {
        if (t > this.offset)throw new UnderflowError;
        for (this.list.first || (this.list.rewind(), this.localOffset = this.list.first.length), this.localOffset -= t, this.offset -= t; this.list.first.prev && this.localOffset < 0;)this.list.rewind(), this.localOffset += this.list.first.length;
        return this
    }, t.prototype.seek = function (t) {
        return t > this.offset ? this.advance(t - this.offset) : t < this.offset ? this.rewind(this.offset - t) : void 0
    }, t.prototype.readUInt8 = function () {
        var t;
        if (!this.available(1))throw new UnderflowError;
        return t = this.list.first.data[this.localOffset], this.localOffset += 1, this.offset += 1, this.localOffset === this.list.first.length && (this.localOffset = 0, this.list.advance()), t
    }, t.prototype.peekUInt8 = function (t) {
        var e;
        if (null == t && (t = 0), !this.available(t + 1))throw new UnderflowError;
        for (t = this.localOffset + t, e = this.list.first; e;) {
            if (e.length > t)return e.data[t];
            t -= e.length, e = e.next
        }
        return 0
    }, t.prototype.read = function (t, e) {
        var r, i, n;
        if (null == e && (e = !1), e === c)for (r = i = 0; i < t; r = i += 1)d[r] = this.readUInt8(); else for (r = n = t - 1; n >= 0; r = n += -1)d[r] = this.readUInt8()
    }, t.prototype.peek = function (t, e, r) {
        var i, n, s;
        if (null == r && (r = !1), r === c)for (i = n = 0; n < t; i = n += 1)d[i] = this.peekUInt8(e + i); else for (i = s = 0; s < t; i = s += 1)d[t - i - 1] = this.peekUInt8(e + i)
    }, t.prototype.readInt8 = function () {
        return this.read(1), f[0]
    }, t.prototype.peekInt8 = function (t) {
        return null == t && (t = 0), this.peek(1, t), f[0]
    }, t.prototype.readUInt16 = function (t) {
        return this.read(2, t), u[0]
    }, t.prototype.peekUInt16 = function (t, e) {
        return null == t && (t = 0), this.peek(2, t, e), u[0]
    }, t.prototype.readInt16 = function (t) {
        return this.read(2, t), a[0]
    }, t.prototype.peekInt16 = function (t, e) {
        return null == t && (t = 0), this.peek(2, t, e), a[0]
    }, t.prototype.readUInt24 = function (t) {
        return t ? this.readUInt16(!0) + (this.readUInt8() << 16) : (this.readUInt16() << 8) + this.readUInt8()
    }, t.prototype.peekUInt24 = function (t, e) {
        return null == t && (t = 0), e ? this.peekUInt16(t, !0) + (this.peekUInt8(t + 2) << 16) : (this.peekUInt16(t) << 8) + this.peekUInt8(t + 2)
    }, t.prototype.readInt24 = function (t) {
        return t ? this.readUInt16(!0) + (this.readInt8() << 16) : (this.readInt16() << 8) + this.readUInt8()
    }, t.prototype.peekInt24 = function (t, e) {
        return null == t && (t = 0), e ? this.peekUInt16(t, !0) + (this.peekInt8(t + 2) << 16) : (this.peekInt16(t) << 8) + this.peekUInt8(t + 2)
    }, t.prototype.readUInt32 = function (t) {
        return this.read(4, t), l[0]
    }, t.prototype.peekUInt32 = function (t, e) {
        return null == t && (t = 0), this.peek(4, t, e), l[0]
    }, t.prototype.readInt32 = function (t) {
        return this.read(4, t), h[0]
    }, t.prototype.peekInt32 = function (t, e) {
        return null == t && (t = 0), this.peek(4, t, e), h[0]
    }, t.prototype.readFloat32 = function (t) {
        return this.read(4, t), i[0]
    }, t.prototype.peekFloat32 = function (t, e) {
        return null == t && (t = 0), this.peek(4, t, e), i[0]
    }, t.prototype.readFloat64 = function (t) {
        return this.read(8, t), n ? n[0] : s()
    }, s = function () {
        var t, e, r, i, n, s;
        return i = l[0], (r = l[1]) && 2147483648 !== r ? (s = 1 - 2 * (r >>> 31), t = r >>> 20 & 2047, e = 1048575 & r, 2047 === t ? e ? NaN : s * (1 / 0) : (t -= 1023, n = (1048576 | e) * Math.pow(2, t - 20), n += i * Math.pow(2, t - 52), s * n)) : 0
    }, t.prototype.peekFloat64 = function (t, e) {
        return null == t && (t = 0), this.peek(8, t, e), n ? n[0] : s()
    }, t.prototype.readFloat80 = function (t) {
        return this.read(10, t), o()
    }, o = function () {
        var t, e, r, i, n, s, o;
        return i = l[0], n = l[1], t = d[9], e = d[8], o = 1 - 2 * (t >>> 7), 0 == (r = (127 & t) << 8 | e) && 0 === n && 0 === i ? 0 : 32767 === r ? 0 === n && 0 === i ? o * (1 / 0) : NaN : (r -= 16383, s = n * Math.pow(2, r - 31), s += i * Math.pow(2, r - 63), o * s)
    }, t.prototype.peekFloat80 = function (t, e) {
        return null == t && (t = 0), this.peek(10, t, e), o()
    }, t.prototype.readBuffer = function (t) {
        var e, r, i, n;
        for (i = (r = AVBuffer.allocate(t)).data, e = n = 0; n < t; e = n += 1)i[e] = this.readUInt8();
        return r
    }, t.prototype.peekBuffer = function (t, e) {
        var r, i, n, s;
        for (null == t && (t = 0), n = (i = AVBuffer.allocate(e)).data, r = s = 0; s < e; r = s += 1)n[r] = this.peekUInt8(t + r);
        return i
    }, t.prototype.readSingleBuffer = function (t) {
        var e;
        return e = this.list.first.slice(this.localOffset, t), this.advance(e.length), e
    }, t.prototype.peekSingleBuffer = function (t, e) {
        return this.list.first.slice(this.localOffset + t, e)
    }, t.prototype.readString = function (t, e) {
        return null == e && (e = "ascii"), r.call(this, 0, t, e, !0)
    }, t.prototype.peekString = function (t, e, i) {
        return null == t && (t = 0), null == i && (i = "ascii"), r.call(this, t, e, i, !1)
    }, r = function (t, e, r, i) {
        var n, s, o, a, h, f, c, u, l, d, p, w;
        switch (r = r.toLowerCase(), u = null === e ? 0 : -1, null == e && (e = 1 / 0), f = t + e, d = "", r) {
            case"ascii":
            case"latin1":
                for (; t < f && (h = this.peekUInt8(t++)) !== u;)d += String.fromCharCode(h);
                break;
            case"utf8":
            case"utf-8":
                for (; t < f && (n = this.peekUInt8(t++)) !== u;)0 == (128 & n) ? d += String.fromCharCode(n) : 192 == (224 & n) ? (s = 63 & this.peekUInt8(t++), d += String.fromCharCode((31 & n) << 6 | s)) : 224 == (240 & n) ? (s = 63 & this.peekUInt8(t++), o = 63 & this.peekUInt8(t++), d += String.fromCharCode((15 & n) << 12 | s << 6 | o)) : 240 == (248 & n) && (l = ((15 & n) << 18 | (s = 63 & this.peekUInt8(t++)) << 12 | (o = 63 & this.peekUInt8(t++)) << 6 | 63 & this.peekUInt8(t++)) - 65536, d += String.fromCharCode(55296 + (l >> 10), 56320 + (1023 & l)));
                break;
            case"utf16-be":
            case"utf16be":
            case"utf16le":
            case"utf16-le":
            case"utf16bom":
            case"utf16-bom":
                switch (r) {
                    case"utf16be":
                    case"utf16-be":
                        c = !1;
                        break;
                    case"utf16le":
                    case"utf16-le":
                        c = !0;
                        break;
                    case"utf16bom":
                    case"utf16-bom":
                        if (e < 2 || (a = this.peekUInt16(t)) === u)return i && this.advance(t += 2), d;
                        c = 65534 === a, t += 2
                }
                for (; t < f && (p = this.peekUInt16(t, c)) !== u;)if (t += 2, p < 55296 || p > 57343)d += String.fromCharCode(p); else {
                    if (p > 56319)throw new Error("Invalid utf16 sequence.");
                    if ((w = this.peekUInt16(t, c)) < 56320 || w > 57343)throw new Error("Invalid utf16 sequence.");
                    d += String.fromCharCode(p, w), t += 2
                }
                p === u && (t += 2);
                break;
            default:
                throw new Error("Unknown encoding: " + r)
        }
        return i && this.advance(t), d
    }, t
}(), Decoder = function (t) {
    function e(t, e) {
        var r = new BufferList;
        this.stream = new Stream(r), this.bitstream = new Bitstream(this.stream), this.format = t;
        try {
            this.setCookie(e)
        } catch (t) {
        }
        this.recieveData = function (t) {
            r.append(t)
        }, this.init()
    }

    var r;
    return __extends(e, t), e.prototype.init = function () {
    }, e.prototype.setCookie = function (t) {
    }, e.prototype.readChunk = function () {
    }, e.prototype.decode = function () {
        var t, e, r;
        e = this.bitstream.offset();
        try {
            r = this.readChunk()
        } catch (e) {
            if (!((t = e) instanceof UnderflowError))return this.emit("error", t), !1
        }
        return r ? (this.emit("data", r), !0) : (this.bitstream.seek(e), !1)
    }, r = {}, e.register = function (t, e) {
        return r[t] = e
    }, e.find = function (t) {
        return r[t] || null
    }, e
}(EventEmitter), Demuxer = function (t) {
    function e(t) {
        var e = new BufferList;
        e.append(t), this.stream = new Stream(e), this.seekPoints = [], this.init()
    }

    var r;
    return __extends(e, t), e.probe = function (t) {
        return !1
    }, e.prototype.init = function () {
    }, e.prototype.readChunk = function (t) {
    }, e.prototype.addSeekPoint = function (t, e) {
        var r;
        return r = this.searchTimestamp(e), this.seekPoints.splice(r, 0, {offset: t, timestamp: e})
    }, e.prototype.searchTimestamp = function (t, e) {
        var r, i, n, s;
        if (i = 0, (r = this.seekPoints.length) > 0 && this.seekPoints[r - 1].timestamp < t)return r;
        for (; i < r;)n = i + r >> 1, (s = this.seekPoints[n].timestamp) < t ? i = n + 1 : s >= t && (r = n);
        return r > this.seekPoints.length && (r = this.seekPoints.length), r
    }, e.prototype.seek = function (t) {
        var e;
        return this.format && this.format.framesPerPacket > 0 && this.format.bytesPerPacket > 0 ? {
            timestamp: t,
            offset: this.format.bytesPerPacket * t / this.format.framesPerPacket
        } : (e = this.searchTimestamp(t), this.seekPoints[e])
    }, r = [], e.register = function (t) {
        return r.push(t)
    }, e.find = function (t) {
        var e, i, n, s, o;
        for (n = Stream.fromBuffer(t), s = 0, o = r.length; s < o; s++) {
            e = r[s], i = n.offset;
            try {
                if (e.probe(n))return e
            } catch (t) {
                t
            }
            n.seek(i)
        }
        return null
    }, e
}(EventEmitter), FLACDemuxer = Demuxer.extend(function () {
    Demuxer.register(this), this.probe = function (t) {
        return "fLaC" === t.peekString(0, 4)
    };
    this.prototype.readChunk = function () {
        var t = this.stream;
        if (!this.readHeader && t.available(4)) {
            if ("fLaC" !== t.readString(4))return this.emit("notFLAC", t.readSingleBuffer(t.remainingBytes()));
            this.readHeader = !0
        }
        for (; t.available(1) && !this.last;) {
            if (!this.readBlockHeaders) {
                var e = t.readUInt8();
                this.last = 128 == (128 & e), this.type = 127 & e, this.size = t.readUInt24()
            }
            if (!this.foundStreamInfo && 0 !== this.type)return this.emit("error", "STREAMINFO must be the first block");
            if (!t.available(this.size))return;
            switch (this.type) {
                case 0:
                    if (this.foundStreamInfo)return this.emit("error", "STREAMINFO can only occur once.");
                    if (34 !== this.size)return this.emit("error", "STREAMINFO size is wrong.");
                    this.foundStreamInfo = !0;
                    var r = new Bitstream(t), i = {
                        minBlockSize: r.read(16),
                        maxBlockSize: r.read(16),
                        minFrameSize: r.read(24),
                        maxFrameSize: r.read(24)
                    };
                    this.format = {
                        formatID: "flac",
                        sampleRate: r.read(20),
                        channelsPerFrame: r.read(3) + 1,
                        bitsPerChannel: r.read(5) + 1
                    }, this.emit("format", this.format), this.emit("cookie", i);
                    var n = r.read(36);
                    this.emit("duration", n / this.format.sampleRate * 1e3 | 0), t.advance(16), this.readBlockHeaders = !1;
                    break;
                case 3:
                    for (var s = 0; s < this.size / 18; s++)if (4294967295 == t.peekUInt32(0) && 4294967295 == t.peekUInt32(1))t.advance(18); else {
                        t.readUInt32() > 0 && this.emit("error", "Seek points with sample number >UInt32 not supported");
                        var o = t.readUInt32();
                        t.readUInt32() > 0 && this.emit("error", "Seek points with stream offset >UInt32 not supported");
                        var a = t.readUInt32();
                        t.advance(2), this.addSeekPoint(a, o)
                    }
                    break;
                case 4:
                    this.metadata || (this.metadata = {});
                    var h = t.readUInt32(!0);
                    this.metadata.vendor = t.readString(h);
                    for (var f = t.readUInt32(!0), c = 0; c < f; c++) {
                        h = t.readUInt32(!0);
                        var u = t.readString(h, "utf8"), l = u.indexOf("=");
                        this.metadata[u.slice(0, l).toLowerCase()] = u.slice(l + 1)
                    }
                    break;
                case 6:
                    if (3 !== t.readUInt32())t.advance(this.size - 4); else {
                        var d = t.readUInt32(), p = (t.readString(d), t.readUInt32()), f = (t.readString(p), t.readUInt32(), t.readUInt32(), t.readUInt32(), t.readUInt32(), t.readUInt32()), w = t.readBuffer(f);
                        this.metadata || (this.metadata = {}), this.metadata.coverArt = w
                    }
                    break;
                default:
                    t.advance(this.size), this.readBlockHeaders = !1
            }
            this.last && this.metadata && this.emit("metadata", this.metadata)
        }
        for (; t.available(1) && this.last;) {
            var m = t.readSingleBuffer(t.remainingBytes());
            this.emit("data", m)
        }
    }
}), FLACDecoder = Decoder.extend(function () {
    Decoder.register("flac", this), this.prototype.setCookie = function (t) {
        this.cookie = t, this.decoded = [];
        for (var e = 0; e < this.format.channelsPerFrame; e++)this.decoded[e] = new Int32Array(t.maxBlockSize);
        this.lpc_total = new Int32Array(2)
    };
    const t = new Int16Array([0, 192, 576, 1152, 2304, 4608, 0, 0, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768]), e = new Int32Array([0, 88200, 176400, 192e3, 8e3, 16e3, 22050, 24e3, 32e3, 44100, 48e3, 96e3, 0, 0, 0, 0]), r = new Int8Array([0, 8, 12, 0, 16, 20, 24, 0]);
    this.prototype.readChunk = function () {
        var i = this.bitstream;
        if (i.available(32)) {
            if (32764 != (32767 & i.read(15)))throw new Error("Invalid sync code");
            i.read(1);
            var n = i.read(4), s = i.read(4), o = i.read(4), a = i.read(3);
            i.advance(1), this.chMode = o;
            var h;
            if (o < 8)h = o + 1, this.chMode = 0; else {
                if (!(o <= 10))throw new Error("Invalid channel mode");
                h = 2
            }
            if (h !== this.format.channelsPerFrame)throw new Error("Switching channel layout mid-stream not supported.");
            if (3 === a || 7 === a)throw new Error("Invalid sample size code");
            if (this.bps = r[a], this.bps !== this.format.bitsPerChannel)throw new Error("Switching bits per sample mid-stream not supported.");
            for (var f = 0; 1 === i.read(1);)f++;
            for (var c = i.read(7 - f); f > 1; f--)i.advance(2), c = c << 6 | i.read(6);
            if (0 === n)throw new Error("Reserved blocksize code");
            this.blockSize = 6 === n ? i.read(8) + 1 : 7 === n ? i.read(16) + 1 : t[n];
            if (s < 12)e[s]; else if (12 === s)1e3 * i.read(8); else if (13 === s)i.read(16); else {
                if (14 !== s)throw new Error("Invalid sample rate code");
                10 * i.read(16)
            }
            i.advance(8);
            for (b = 0; b < h; b++)this.decodeSubframe(b);
            i.align(), i.advance(16);
            var u = this.bps > 16, l = new ArrayBuffer(this.blockSize * h * (u ? 4 : 2)), d = u ? new Int32Array(l) : new Int16Array(l), p = this.blockSize, w = this.decoded, m = 0;
            switch (this.chMode) {
                case 0:
                    for (var v = 0; v < p; v++)for (b = 0; b < h; b++)d[m++] = w[b][v];
                    break;
                case 8:
                    for (b = 0; b < p; b++) {
                        var y = w[0][b], g = w[1][b];
                        d[m++] = y, d[m++] = y - g
                    }
                    break;
                case 9:
                    for (b = 0; b < p; b++) {
                        var y = w[0][b], g = w[1][b];
                        d[m++] = y + g, d[m++] = g
                    }
                    break;
                case 10:
                    for (var b = 0; b < p; b++) {
                        y = w[0][b];
                        y -= (g = w[1][b]) >> 1, d[m++] = y + g, d[m++] = y
                    }
            }
            return d
        }
    }, this.prototype.decodeSubframe = function (t) {
        var e = 0, r = this.bitstream, i = this.blockSize, n = this.decoded;
        if (this.curr_bps = this.bps, 0 === t ? 9 === this.chMode && this.curr_bps++ : 8 !== this.chMode && 10 !== this.chMode || this.curr_bps++, r.read(1))throw new Error("Invalid subframe padding");
        var s = r.read(6);
        if (r.read(1)) {
            for (e = 1; !r.read(1);)e++;
            this.curr_bps -= e
        }
        if (this.curr_bps > 32)throw new Error("decorrelated bit depth > 32 (" + this.curr_bps + ")");
        if (0 === s)for (var o = r.read(this.curr_bps, !0), a = 0; a < i; a++)n[t][a] = o; else if (1 === s)for (var h = this.curr_bps, a = 0; a < i; a++)n[t][a] = r.read(h, !0); else if (s >= 8 && s <= 12)this.decode_subframe_fixed(t, -9 & s); else {
            if (!(s >= 32))throw new Error("Invalid coding type");
            this.decode_subframe_lpc(t, 1 + (-33 & s))
        }
        if (e)for (a = 0; a < i; a++)n[t][a] <<= e
    }, this.prototype.decode_subframe_fixed = function (t, e) {
        for (var r = this.decoded[t], i = this.bitstream, n = this.curr_bps, s = 0; s < e; s++)r[s] = i.read(n, !0);
        this.decode_residuals(t, e);
        var o = 0, a = 0, h = 0, f = 0;
        switch (e > 0 && (o = r[e - 1]), e > 1 && (a = o - r[e - 2]), e > 2 && (h = a - r[e - 2] + r[e - 3]), e > 3 && (f = h - r[e - 2] + 2 * r[e - 3] - r[e - 4]), e) {
            case 0:
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                for (var c = new Int32Array([o, a, h, f]), u = this.blockSize, s = e; s < u; s++) {
                    c[e - 1] += r[s];
                    for (var l = e - 2; l >= 0; l--)c[l] += c[l + 1];
                    r[s] = c[0]
                }
                break;
            default:
                throw new Error("Invalid Predictor Order " + e)
        }
    }, this.prototype.decode_subframe_lpc = function (t, e) {
        for (var r = this.bitstream, n = this.decoded[t], s = this.curr_bps, o = this.blockSize, a = 0; a < e; a++)n[a] = r.read(s, !0);
        var h = r.read(4) + 1;
        if (16 === h)throw new Error("Invalid coefficient precision");
        var f = r.read(5, !0);
        if (f < 0)throw new Error("Negative qlevel, maybe buggy stream");
        for (var c = new Int32Array(32), a = 0; a < e; a++)c[a] = r.read(h, !0);
        if (this.decode_residuals(t, e), this.bps <= 16) {
            for (a = e; a < o - 1; a += 2) {
                for (var u = n[a - e], l = 0, d = 0, p = 0, w = e - 1; w > 0; w--)l += (p = c[w]) * u, d += p * (u = n[a - w]);
                l += (p = c[0]) * u, d += p * (u = n[a] += l >> f), n[a + 1] += d >> f
            }
            if (a < o) {
                for (var m = 0, w = 0; w < e; w++)m += c[w] * n[a - w - 1];
                n[a] += m >> f
            }
        } else for (var v = this.lpc_total, a = e; a < o; a++) {
            for (v[0] = 0, v[1] = 0, w = 0; w < e; w++)!function (t, e, r) {
                var n = e * r, s = n < 0;
                s && (n = -n);
                var o = n % i | 0, a = n / i | 0;
                s && (o = 1 + ~o, a = ~a);
                var h = t[1] >>> 16, f = 65535 & t[1], c = t[0] >>> 16, u = 0, l = 0, d = 0, p = 0;
                d += (p += (65535 & t[0]) + (65535 & o)) >>> 16, p &= 65535, l += (d += c + (o >>> 16)) >>> 16, d &= 65535, u += (l += f + (65535 & a)) >>> 16, l &= 65535, u += h + (a >>> 16), u &= 65535, t[0] = d << 16 | p, t[1] = u << 16 | l
            }(v, c[w], n[a - w - 1]);
            n[a] += v[0] >>> f | v[1] << 32 - f
        }
    };
    const i = Math.pow(2, 32);
    this.prototype.decode_residuals = function (t, e) {
        var r = this.bitstream, i = r.read(2);
        if (i > 1)throw new Error("Illegal residual coding method " + i);
        var n = r.read(4), s = this.blockSize >>> n;
        if (e > s)throw new Error("Invalid predictor order " + e + " > " + s);
        for (var o = this.decoded[t], a = e, h = e, f = 0; f < 1 << n; f++) {
            var c = r.read(0 === i ? 4 : 5);
            if (c === (0 === i ? 15 : 31))for (c = r.read(5); h < s; h++)o[a++] = r.read(c, !0); else for (; h < s; h++)o[a++] = this.golomb(c, 32767, 0);
            h = 0
        }
    };
    this.prototype.golomb = function (t, e, r) {
        var i = this.bitstream, n = i.bitPosition, s = i.peek(32 - n) << n, o = 0, a = 31 - function (t) {
                for (var e = 0, r = 0; !(r = t >>> 24) && (e += 8, !(255 & (r = t >>> 16))) && (e += 8, !(255 & (r = t >>> 8))) && (e += 8, !(255 & (r = t)));)return e += 8;
                return 240 & r ? r >>>= 4 : e += 4, 8 & r ? e : 4 & r ? e + 1 : 2 & r ? e + 2 : 1 & r ? e + 3 : e + 4
            }(1 | s);
        if (a - t >= 7 && 32 - a < e)s >>>= a - t, s += 30 - a << t, i.advance(32 + t - a), o = s; else {
            for (var h = 0; 0 === i.read(1); h++)s = i.peek(32 - n) << n;
            o = h < e - 1 ? (s = t ? i.read(t) : 0) + (h << t) : h === e - 1 ? (s = i.read(r)) + 1 : -1
        }
        return o >> 1 ^ -(1 & o)
    }
});
var classADTSDemuxer = null, classAACDecoder = null, classFilterBank = null;
!function t(e, r, i) {
    function n(o, a) {
        if (!r[o]) {
            if (!e[o]) {
                var h = "function" == typeof require && require;
                if (!a && h)return h(o, !0);
                if (s)return s(o, !0);
                throw new Error("Cannot find module '" + o + "'")
            }
            var f = r[o] = {exports: {}};
            e[o][0].call(f.exports, function (t) {
                var r = e[o][1][t];
                return n(r || t)
            }, f, f.exports, t, e, r, i)
        }
        return r[o].exports
    }

    for (var s = "function" == typeof require && require, o = 0; o < i.length; o++)n(i[o]);
    return n
}({
    1: [function (t, e, r) {
        (function (r) {
            "undefined" != typeof window ? window.AV : void 0 !== r && r.AV;
            var i = t("./tables"), n = Demuxer.extend(function () {
                Demuxer.register(this), classADTSDemuxer = this, this.probe = function (t) {
                    var e = t.offset;
                    return t.available(2) && 65520 == (65526 & t.readUInt16()) ? (t.seek(e), !0) : (t.seek(e), !1)
                }, this.prototype.init = function () {
                    this.bitstream = new Bitstream(this.stream)
                }, this.readHeader = function (t) {
                    if (4095 !== t.read(12))throw new Error("Invalid ADTS header.");
                    var e = {};
                    t.advance(3);
                    var r = !!t.read(1);
                    return e.profile = t.read(2) + 1, e.samplingIndex = t.read(4), t.advance(1), e.chanConfig = t.read(3), t.advance(4), e.frameLength = t.read(13), t.advance(11), e.numFrames = t.read(2) + 1, r || t.advance(16), e
                }, this.prototype.readChunk = function () {
                    if (!this.sentHeader) {
                        var t = this.stream.offset, e = n.readHeader(this.bitstream);
                        this.emit("format", {
                            formatID: "aac ",
                            sampleRate: i.SAMPLE_RATES[e.samplingIndex],
                            channelsPerFrame: e.chanConfig,
                            bitsPerChannel: 16
                        });
                        var r = new Uint8Array(2);
                        r[0] = e.profile << 3 | e.samplingIndex >> 1 & 7, r[1] = (1 & e.samplingIndex) << 7 | e.chanConfig << 3, this.emit("cookie", new AVBuffer(r)), this.stream.seek(t), this.sentHeader = !0
                    }
                    for (; this.stream.available(1);) {
                        var s = this.stream.readSingleBuffer(this.stream.remainingBytes());
                        this.emit("data", s)
                    }
                }
            });
            e.exports = n
        }).call(this, "undefined" != typeof self ? self : "undefined" != typeof window ? window : {})
    }, {"./tables": 11}],
    2: [function (t, e, r) {
        function i(t) {
            this.ics = new n(t), this.channelPair = new Array(8), this.idSelect = new Int32Array(8), this.chSelect = new Int32Array(8), this.gain = new Array(16)
        }

        var n = t("./ics"), s = t("./huffman");
        i.BEFORE_TNS = 0, i.AFTER_TNS = 1, i.AFTER_IMDCT = 2;
        const o = new Float32Array([1.0905077326652577, 1.189207115002721, 1.4142135623730951, 2]);
        i.prototype = {
            decode: function (t, e) {
                var r = this.channelPair, a = this.idSelect, h = this.chSelect;
                this.couplingPoint = 2 * t.read(1), this.coupledCount = t.read(3);
                for (var f = 0, c = 0; c <= this.coupledCount; c++)f++, r[c] = t.read(1), a[c] = t.read(4), r[c] ? (h[c] = t.read(2), 3 === h[c] && f++) : h[c] = 2;
                this.couplingPoint += t.read(1), this.couplingPoint |= this.couplingPoint >>> 1;
                var u = t.read(1), l = o[t.read(2)];
                this.ics.decode(t, e, !1);
                for (var d = this.ics.info.groupCount, p = this.ics.info.maxSFB, w = this.ics.bandTypes, c = 0; c < f; c++) {
                    var m = 0, v = 1, y = 0, g = 1;
                    c > 0 && (y = (v = this.couplingPoint === i.AFTER_IMDCT ? 1 : t.read(1)) ? s.decodeScaleFactor(t) - 60 : 0, g = Math.pow(l, -y));
                    var b = this.gain[c] = new Float32Array(120);
                    if (this.couplingPoint === i.AFTER_IMDCT)b[0] = g; else for (var I = 0; I < d; I++)for (var k = 0; k < p; k++)if (w[m] !== n.ZERO_BT) {
                        if (0 === v) {
                            var E = s.decodeScaleFactor(t) - 60;
                            if (0 !== E) {
                                var A = 1;
                                E = y += E, u || (A -= 2 * (1 & E), E >>>= 1), g = Math.pow(l, -E) * A
                            }
                        }
                        b[m++] = g
                    }
                }
            }, applyIndependentCoupling: function (t, e) {
                for (var r = this.gain[t][0], i = this.ics.data, n = 0; n < e.length; n++)e[n] += r * i[n]
            }, applyDependentCoupling: function (t, e) {
                for (var r = this.ics.info, i = r.swbOffsets, s = r.groupCount, o = r.maxSFB, a = this.ics.bandTypes, h = this.ics.data, f = 0, c = 0, u = this.gain[t], l = 0; l < s; l++) {
                    for (var d = r.groupLength[l], p = 0; p < o; p++, f++)if (a[f] !== n.ZERO_BT)for (var w = u[f], m = 0; m < d; m++)for (var v = i[p]; v < i[swb + 1]; v++)e[c + 128 * m + v] += w * h[c + 128 * m + v];
                    c += 128 * d
                }
            }
        }, e.exports = i
    }, {"./huffman": 7, "./ics": 8}],
    3: [function (t, e, r) {
        function i(t) {
            this.ms_used = [], this.left = new n(t), this.right = new n(t)
        }

        var n = t("./ics");
        i.prototype.decode = function (t, e) {
            var r = this.left, i = this.right, n = this.ms_used;
            if (this.commonWindow = !!t.read(1)) {
                r.info.decode(t, e, !0), i.info = r.info;
                var s = t.read(2);
                switch (this.maskPresent = !!s, s) {
                    case 1:
                        for (var o = r.info.groupCount * r.info.maxSFB, a = 0; a < o; a++)n[a] = !!t.read(1);
                        break;
                    case 0:
                    case 2:
                        for (var h = !!s, a = 0; a < 128; a++)n[a] = h;
                        break;
                    default:
                        throw new Error("Reserved ms mask type: " + s)
                }
            } else for (a = 0; a < 128; a++)n[a] = !1;
            r.decode(t, e, this.commonWindow), i.decode(t, e, this.commonWindow)
        }, e.exports = i
    }, {"./ics": 8}],
    4: [function (t, e, r) {
        (function (r) {
            "undefined" != typeof window ? window.AV : void 0 !== r && r.AV;
            var i = t("./adts_demuxer"), n = t("./ics"), s = t("./cpe"), o = t("./cce"), a = (t("./filter_bank"), t("./tables")), h = Decoder.extend(function () {
                Decoder.register("mp4a", this), Decoder.register("aac ", this), classAACDecoder = this;
                this.prototype.init = function () {
                    this.format.floatingPoint = !0
                }, this.prototype.setCookie = function (t) {
                    var e = Stream.fromBuffer(t[0]), r = new Bitstream(e);
                    if (this.config = {}, this.config.profile = r.read(5), 31 === this.config.profile && (this.config.profile = 32 + r.read(6)), this.config.sampleIndex = r.read(4), 15 === this.config.sampleIndex) {
                        this.config.sampleRate = r.read(24);
                        for (var i = 0; i < a.SAMPLE_RATES.length; i++)if (a.SAMPLE_RATES[i] === this.config.sampleRate) {
                            this.config.sampleIndex = i;
                            break
                        }
                    } else this.config.sampleRate = a.SAMPLE_RATES[this.config.sampleIndex];
                    switch (this.config.chanConfig = r.read(4), this.format.channelsPerFrame = this.config.chanConfig, this.config.profile) {
                        case 1:
                        case 2:
                        case 4:
                            if (r.read(1))throw new Error("frameLengthFlag not supported");
                            if (this.config.frameLength = 1024, r.read(1) && r.advance(14), r.read(1) && (this.config.profile > 16 && (this.config.sectionDataResilience = r.read(1), this.config.scalefactorResilience = r.read(1), this.config.spectralDataResilience = r.read(1)), r.advance(1)), 0 === this.config.chanConfig)throw r.advance(4), new Error("PCE unimplemented");
                            break;
                        default:
                            throw new Error("AAC profile " + this.config.profile + " not supported.")
                    }
                    this.filter_bank = t[1]
                };
                this.prototype.readChunk = function () {
                    var t = this.bitstream;
                    4095 === t.peek(12) && i.readHeader(t), this.cces = [];
                    for (var e = [], r = this.config, a = r.frameLength, h = null; 7 !== (h = t.read(3));) {
                        var f = t.read(4);
                        switch (h) {
                            case 0:
                            case 3:
                                var c = new n(this.config);
                                c.id = f, e.push(c), c.decode(t, r, !1);
                                break;
                            case 1:
                                var u = new s(this.config);
                                u.id = f, e.push(u), u.decode(t, r);
                                break;
                            case 2:
                                var l = new o(this.config);
                                this.cces.push(l), l.decode(t, r);
                                break;
                            case 4:
                                var d = t.read(1), p = t.read(8);
                                255 === p && (p += t.read(8)), d && t.align(), t.advance(8 * p);
                                break;
                            case 5:
                                throw new Error("TODO: PCE_ELEMENT");
                            case 6:
                                15 === f && (f += t.read(8) - 1), t.advance(8 * f);
                                break;
                            default:
                                throw new Error("Unknown element")
                        }
                    }
                    t.align(), this.process(e);
                    for (var w = this.data, m = w.length, v = new Float32Array(a * m), y = 0, g = 0; g < a; g++)for (var b = 0; b < m; b++)v[y++] = w[b][g] / 32768;
                    return v
                }, this.prototype.process = function (t) {
                    for (var e = this.config.chanConfig, r = 1 * this.config.frameLength, i = this.data = [], a = 0; a < e; a++)i[a] = new Float32Array(r);
                    for (var h = 0, a = 0; a < t.length && h < e; a++) {
                        var f = t[a];
                        if (f instanceof n)h += this.processSingle(f, h); else if (f instanceof s)this.processPair(f, h), h += 2; else {
                            if (!(f instanceof o))throw new Error("Unknown element found.");
                            h++
                        }
                    }
                }, this.prototype.processSingle = function (t, e) {
                    var r = this.config.profile, i = t.info, n = t.data;
                    if (1 === r)throw new Error("Main prediction unimplemented");
                    if (4 === r)throw new Error("LTP prediction unimplemented");
                    if (this.applyChannelCoupling(t, o.BEFORE_TNS, n, null), t.tnsPresent && t.tns.process(t, n, !1), this.applyChannelCoupling(t, o.AFTER_TNS, n, null), this.filter_bank.process(i, n, this.data[e], e), 4 === r)throw new Error("LTP prediction unimplemented");
                    if (this.applyChannelCoupling(t, o.AFTER_IMDCT, this.data[e], null), t.gainPresent)throw new Error("Gain control not implemented");
                    if (this.sbrPresent)throw new Error("SBR not implemented");
                    return 1
                }, this.prototype.processPair = function (t, e) {
                    var r = this.config.profile, i = t.left, n = t.right, s = i.info, a = n.info, h = i.data, f = n.data;
                    if (t.commonWindow && t.maskPresent && this.processMS(t, h, f), 1 === r)throw new Error("Main prediction unimplemented");
                    if (this.processIS(t, h, f), 4 === r)throw new Error("LTP prediction unimplemented");
                    if (this.applyChannelCoupling(t, o.BEFORE_TNS, h, f), i.tnsPresent && i.tns.process(i, h, !1), n.tnsPresent && n.tns.process(n, f, !1), this.applyChannelCoupling(t, o.AFTER_TNS, h, f), this.filter_bank.process(s, h, this.data[e], e), this.filter_bank.process(a, f, this.data[e + 1], e + 1), 4 === r)throw new Error("LTP prediction unimplemented");
                    if (this.applyChannelCoupling(t, o.AFTER_IMDCT, this.data[e], this.data[e + 1]), i.gainPresent)throw new Error("Gain control not implemented");
                    if (n.gainPresent)throw new Error("Gain control not implemented");
                    if (this.sbrPresent)throw new Error("SBR not implemented")
                }, this.prototype.processIS = function (t, e, r) {
                    for (var i = t.right, s = i.info, o = s.swbOffsets, a = s.groupCount, h = s.maxSFB, f = i.bandTypes, c = i.sectEnd, u = i.scaleFactors, l = 0, d = 0, p = 0; p < a; p++) {
                        for (var w = 0; w < h;) {
                            var m = c[l];
                            if (f[l] === n.INTENSITY_BT || f[l] === n.INTENSITY_BT2)for (; w < m; w++, l++) {
                                var v = f[l] === n.INTENSITY_BT ? 1 : -1;
                                t.maskPresent && (v *= t.ms_used[l] ? -1 : 1);
                                for (var y = v * u[l], g = 0; g < s.groupLength[p]; g++)for (var b = d + 128 * g + o[w], I = o[w + 1] - o[w], k = 0; k < I; k++)r[b + k] = e[b + k] * y
                            } else l += m - w, w = m
                        }
                        d += 128 * s.groupLength[p]
                    }
                }, this.prototype.processMS = function (t, e, r) {
                    for (var i = t.left, s = i.info, o = s.swbOffsets, a = s.groupCount, h = s.maxSFB, f = i.bandTypes, c = t.right.bandTypes, u = 0, l = 0, d = 0; d < a; d++) {
                        for (var p = 0; p < h; p++, l++)if (t.ms_used[l] && f[l] < n.NOISE_BT && c[l] < n.NOISE_BT)for (var w = 0; w < s.groupLength[d]; w++)for (var m = u + 128 * w + o[p], v = 0; v < o[p + 1] - o[p]; v++) {
                            var y = e[m + v] - r[m + v];
                            e[m + v] += r[m + v], r[m + v] = y
                        }
                        u += 128 * s.groupLength[d]
                    }
                }, this.prototype.applyChannelCoupling = function (t, e, r, i) {
                    for (var n = this.cces, a = t instanceof s, h = e === o.AFTER_IMDCT ? "applyIndependentCoupling" : "applyDependentCoupling", f = 0; f < n.length; f++) {
                        var c = n[f], u = 0;
                        if (c.couplingPoint === e)for (var l = 0; l < c.coupledCount; l++) {
                            var d = c.chSelect[l];
                            c.channelPair[l] === a && c.idSelect[l] === t.id ? (1 !== d && (c[h](u, r), d && u++), 2 !== d && c[h](u++, i)) : u += 1 + (3 === d ? 1 : 0)
                        }
                    }
                }
            });
            e.exports = h
        }).call(this, "undefined" != typeof self ? self : "undefined" != typeof window ? window : {})
    }, {"./adts_demuxer": 1, "./cce": 2, "./cpe": 3, "./filter_bank": 6, "./ics": 8, "./tables": 11}],
    5: [function (t, e, r) {
        function i(t) {
            switch (this.length = t, t) {
                case 64:
                    this.roots = n(64);
                    break;
                case 512:
                    this.roots = s(512);
                    break;
                case 60:
                    this.roots = n(60);
                    break;
                case 480:
                    this.roots = s(480);
                    break;
                default:
                    throw new Error("unexpected FFT length: " + t)
            }
            this.rev = new Array(t);
            for (var e = 0; e < t; e++)this.rev[e] = new Float32Array(2);
            this.a = new Float32Array(2), this.b = new Float32Array(2), this.c = new Float32Array(2), this.d = new Float32Array(2), this.e1 = new Float32Array(2), this.e2 = new Float32Array(2)
        }

        function n(t) {
            for (var e = 2 * Math.PI / t, r = Math.cos(e), i = Math.sin(e), n = new Array(t), s = 0; s < t; s++)n[s] = new Float32Array(2);
            n[0][0] = 1, n[0][1] = 0;
            for (var o = 0, s = 1; s < t; s++)n[s][0] = n[s - 1][0] * r + o * i, o = o * r - n[s - 1][0] * i, n[s][1] = -o;
            return n
        }

        function s(t) {
            for (var e = 2 * Math.PI / t, r = Math.cos(e), i = Math.sin(e), n = new Array(t), s = 0; s < t; s++)n[s] = new Float32Array(3);
            n[0][0] = 1, n[0][1] = 0, n[0][2] = 0;
            for (s = 1; s < t; s++)n[s][0] = n[s - 1][0] * r + n[s - 1][2] * i, n[s][2] = n[s - 1][2] * r - n[s - 1][0] * i, n[s][1] = -n[s][2];
            return n
        }

        i.prototype.process = function (t, e) {
            for (var r = this.length, i = e ? 2 : 1, n = e ? r : 1, s = this.rev, o = this.roots, a = 0, h = 0; h < r; h++) {
                s[h][0] = t[a][0], s[h][1] = t[a][1];
                for (y = r >>> 1; a >= y && y > 0;)a -= y, y >>= 1;
                a += y
            }
            for (var f = this.a, c = this.b, u = this.c, l = this.d, d = this.e1, p = this.e2, h = 0; h < r; h++)t[h][0] = s[h][0], t[h][1] = s[h][1];
            for (h = 0; h < r; h += 4)f[0] = t[h][0] + t[h + 1][0], f[1] = t[h][1] + t[h + 1][1], c[0] = t[h + 2][0] + t[h + 3][0], c[1] = t[h + 2][1] + t[h + 3][1], u[0] = t[h][0] - t[h + 1][0], u[1] = t[h][1] - t[h + 1][1], l[0] = t[h + 2][0] - t[h + 3][0], l[1] = t[h + 2][1] - t[h + 3][1], t[h][0] = f[0] + c[0], t[h][1] = f[1] + c[1], t[h + 2][0] = f[0] - c[0], t[h + 2][1] = f[1] - c[1], d[0] = u[0] - l[1], d[1] = u[1] + l[0], p[0] = u[0] + l[1], p[1] = u[1] - l[0], e ? (t[h + 1][0] = p[0], t[h + 1][1] = p[1], t[h + 3][0] = d[0], t[h + 3][1] = d[1]) : (t[h + 1][0] = d[0], t[h + 1][1] = d[1], t[h + 3][0] = p[0], t[h + 3][1] = p[1]);
            for (h = 4; h < r; h <<= 1)for (var w = h << 1, m = r / w, v = 0; v < r; v += w)for (var y = 0; y < h; y++) {
                var g = y * m, b = o[g][0], I = o[g][i], k = t[h + v + y][0] * b - t[h + v + y][1] * I, E = t[h + v + y][0] * I + t[h + v + y][1] * b;
                t[h + v + y][0] = (t[v + y][0] - k) * n, t[h + v + y][1] = (t[v + y][1] - E) * n, t[v + y][0] = (t[v + y][0] + k) * n, t[v + y][1] = (t[v + y][1] + E) * n
            }
        }, e.exports = i
    }, {}],
    6: [function (t, e, r) {
        function i(t, e) {
            if (t)throw new Error("WHA?? No small frames allowed.");
            this.length = 1024, this.shortLength = 128, this.mid = (this.length - this.shortLength) / 2, this.trans = this.shortLength / 2, this.mdctShort = new a(2 * this.shortLength), this.mdctLong = new a(2 * this.length), this.overlaps = new Array(e);
            for (var r = 0; r < e; r++)this.overlaps[r] = new Float32Array(this.length);
            this.buf = new Float32Array(2 * this.length)
        }

        function n(t) {
            for (var e = new Float32Array(t), r = 0; r < t; r++)e[r] = Math.sin((r + .5) * (Math.PI / (2 * t)));
            return e
        }

        function s(t, e) {
            for (var r = Math.PI / e, i = new Float32Array(e), n = 0, s = new Float32Array(e), o = t * r * (t * r), a = 0; a < e; a++) {
                for (var h = a * (e - a) * o, f = 1, c = 50; c > 0; c--)f = f * h / (c * c) + 1;
                n += f, s[a] = n
            }
            n++;
            for (a = 0; a < e; a++)i[a] = Math.sqrt(s[a] / n);
            return i
        }

        var o = t("./ics"), a = t("./mdct");
        classFilterBank = i;
        const h = n(1024), f = n(128), c = [h, s(4, 1024)], u = [f, s(6, 128)];
        i.prototype.process = function (t, e, r, i) {
            var n = this.overlaps[i], s = t.windowShape[1], a = t.windowShape[0], h = c[s], f = u[s], l = c[a], d = u[a], p = this.length, w = this.shortLength, m = this.mid, v = this.trans, y = this.buf, g = this.mdctLong, b = this.mdctShort;
            switch (t.windowSequence) {
                case o.ONLY_LONG_SEQUENCE:
                    g.process(e, 0, y, 0);
                    for (I = 0; I < p; I++)r[I] = n[I] + y[I] * l[I];
                    for (I = 0; I < p; I++)n[I] = y[p + I] * h[p - 1 - I];
                    break;
                case o.LONG_START_SEQUENCE:
                    g.process(e, 0, y, 0);
                    for (I = 0; I < p; I++)r[I] = n[I] + y[I] * l[I];
                    for (I = 0; I < m; I++)n[I] = y[p + I];
                    for (I = 0; I < w; I++)n[m + I] = y[p + m + I] * f[w - I - 1];
                    for (I = 0; I < m; I++)n[m + w + I] = 0;
                    break;
                case o.EIGHT_SHORT_SEQUENCE:
                    for (I = 0; I < 8; I++)b.process(e, I * w, y, 2 * I * w);
                    for (I = 0; I < m; I++)r[I] = n[I];
                    for (I = 0; I < w; I++)r[m + I] = n[m + I] + y[I] * d[I], r[m + 1 * w + I] = n[m + 1 * w + I] + y[1 * w + I] * f[w - 1 - I] + y[2 * w + I] * f[I], r[m + 2 * w + I] = n[m + 2 * w + I] + y[3 * w + I] * f[w - 1 - I] + y[4 * w + I] * f[I], r[m + 3 * w + I] = n[m + 3 * w + I] + y[5 * w + I] * f[w - 1 - I] + y[6 * w + I] * f[I], I < v && (r[m + 4 * w + I] = n[m + 4 * w + I] + y[7 * w + I] * f[w - 1 - I] + y[8 * w + I] * f[I]);
                    for (I = 0; I < w; I++)I >= v && (n[m + 4 * w + I - p] = y[7 * w + I] * f[w - 1 - I] + y[8 * w + I] * f[I]), n[m + 5 * w + I - p] = y[9 * w + I] * f[w - 1 - I] + y[10 * w + I] * f[I], n[m + 6 * w + I - p] = y[11 * w + I] * f[w - 1 - I] + y[12 * w + I] * f[I], n[m + 7 * w + I - p] = y[13 * w + I] * f[w - 1 - I] + y[14 * w + I] * f[I], n[m + 8 * w + I - p] = y[15 * w + I] * f[w - 1 - I];
                    for (I = 0; I < m; I++)n[m + w + I] = 0;
                    break;
                case o.LONG_STOP_SEQUENCE:
                    g.process(e, 0, y, 0);
                    for (I = 0; I < m; I++)r[I] = n[I];
                    for (I = 0; I < w; I++)r[m + I] = n[m + I] + y[m + I] * d[I];
                    for (I = 0; I < m; I++)r[m + w + I] = n[m + w + I] + y[m + w + I];
                    for (var I = 0; I < p; I++)n[I] = y[p + I] * h[p - 1 - I]
            }
        }, e.exports = i
    }, {"./ics": 8, "./mdct": 9}],
    7: [function (t, e, r) {
        const i = [[1, 0, 60], [3, 4, 59], [4, 10, 61], [4, 11, 58], [4, 12, 62], [5, 26, 57], [5, 27, 63], [6, 56, 56], [6, 57, 64], [6, 58, 55], [6, 59, 65], [7, 120, 66], [7, 121, 54], [7, 122, 67], [8, 246, 53], [8, 247, 68], [8, 248, 52], [8, 249, 69], [8, 250, 51], [9, 502, 70], [9, 503, 50], [9, 504, 49], [9, 505, 71], [10, 1012, 72], [10, 1013, 48], [10, 1014, 73], [10, 1015, 47], [10, 1016, 74], [10, 1017, 46], [11, 2036, 76], [11, 2037, 75], [11, 2038, 77], [11, 2039, 78], [11, 2040, 45], [11, 2041, 43], [12, 4084, 44], [12, 4085, 79], [12, 4086, 42], [12, 4087, 41], [12, 4088, 80], [12, 4089, 40], [13, 8180, 81], [13, 8181, 39], [13, 8182, 82], [13, 8183, 38], [13, 8184, 83], [14, 16370, 37], [14, 16371, 35], [14, 16372, 85], [14, 16373, 33], [14, 16374, 36], [14, 16375, 34], [14, 16376, 84], [14, 16377, 32], [15, 32756, 87], [15, 32757, 89], [15, 32758, 30], [15, 32759, 31], [16, 65520, 86], [16, 65521, 29], [16, 65522, 26], [16, 65523, 27], [16, 65524, 28], [16, 65525, 24], [16, 65526, 88], [17, 131054, 25], [17, 131055, 22], [17, 131056, 23], [18, 262114, 90], [18, 262115, 21], [18, 262116, 19], [18, 262117, 3], [18, 262118, 1], [18, 262119, 2], [18, 262120, 0], [19, 524242, 98], [19, 524243, 99], [19, 524244, 100], [19, 524245, 101], [19, 524246, 102], [19, 524247, 117], [19, 524248, 97], [19, 524249, 91], [19, 524250, 92], [19, 524251, 93], [19, 524252, 94], [19, 524253, 95], [19, 524254, 96], [19, 524255, 104], [19, 524256, 111], [19, 524257, 112], [19, 524258, 113], [19, 524259, 114], [19, 524260, 115], [19, 524261, 116], [19, 524262, 110], [19, 524263, 105], [19, 524264, 106], [19, 524265, 107], [19, 524266, 108], [19, 524267, 109], [19, 524268, 118], [19, 524269, 6], [19, 524270, 8], [19, 524271, 9], [19, 524272, 10], [19, 524273, 5], [19, 524274, 103], [19, 524275, 120], [19, 524276, 119], [19, 524277, 4], [19, 524278, 7], [19, 524279, 15], [19, 524280, 16], [19, 524281, 18], [19, 524282, 20], [19, 524283, 17], [19, 524284, 11], [19, 524285, 12], [19, 524286, 14], [19, 524287, 13]], n = [[[1, 0, 0, 0, 0, 0], [5, 16, 1, 0, 0, 0], [5, 17, -1, 0, 0, 0], [5, 18, 0, 0, 0, -1], [5, 19, 0, 1, 0, 0], [5, 20, 0, 0, 0, 1], [5, 21, 0, 0, -1, 0], [5, 22, 0, 0, 1, 0], [5, 23, 0, -1, 0, 0], [7, 96, 1, -1, 0, 0], [7, 97, -1, 1, 0, 0], [7, 98, 0, 0, -1, 1], [7, 99, 0, 1, -1, 0], [7, 100, 0, -1, 1, 0], [7, 101, 0, 0, 1, -1], [7, 102, 1, 1, 0, 0], [7, 103, 0, 0, -1, -1], [7, 104, -1, -1, 0, 0], [7, 105, 0, -1, -1, 0], [7, 106, 1, 0, -1, 0], [7, 107, 0, 1, 0, -1], [7, 108, -1, 0, 1, 0], [7, 109, 0, 0, 1, 1], [7, 110, 1, 0, 1, 0], [7, 111, 0, -1, 0, 1], [7, 112, 0, 1, 1, 0], [7, 113, 0, 1, 0, 1], [7, 114, -1, 0, -1, 0], [7, 115, 1, 0, 0, 1], [7, 116, -1, 0, 0, -1], [7, 117, 1, 0, 0, -1], [7, 118, -1, 0, 0, 1], [7, 119, 0, -1, 0, -1], [9, 480, 1, 1, -1, 0], [9, 481, -1, 1, -1, 0], [9, 482, 1, -1, 1, 0], [9, 483, 0, 1, 1, -1], [9, 484, 0, 1, -1, 1], [9, 485, 0, -1, 1, 1], [9, 486, 0, -1, 1, -1], [9, 487, 1, -1, -1, 0], [9, 488, 1, 0, -1, 1], [9, 489, 0, 1, -1, -1], [9, 490, -1, 1, 1, 0], [9, 491, -1, 0, 1, -1], [9, 492, -1, -1, 1, 0], [9, 493, 0, -1, -1, 1], [9, 494, 1, -1, 0, 1], [9, 495, 1, -1, 0, -1], [9, 496, -1, 1, 0, -1], [9, 497, -1, -1, -1, 0], [9, 498, 0, -1, -1, -1], [9, 499, 0, 1, 1, 1], [9, 500, 1, 0, 1, -1], [9, 501, 1, 1, 0, 1], [9, 502, -1, 1, 0, 1], [9, 503, 1, 1, 1, 0], [10, 1008, -1, -1, 0, 1], [10, 1009, -1, 0, -1, -1], [10, 1010, 1, 1, 0, -1], [10, 1011, 1, 0, -1, -1], [10, 1012, -1, 0, -1, 1], [10, 1013, -1, -1, 0, -1], [10, 1014, -1, 0, 1, 1], [10, 1015, 1, 0, 1, 1], [11, 2032, 1, -1, 1, -1], [11, 2033, -1, 1, -1, 1], [11, 2034, -1, 1, 1, -1], [11, 2035, 1, -1, -1, 1], [11, 2036, 1, 1, 1, 1], [11, 2037, -1, -1, 1, 1], [11, 2038, 1, 1, -1, -1], [11, 2039, -1, -1, 1, -1], [11, 2040, -1, -1, -1, -1], [11, 2041, 1, 1, -1, 1], [11, 2042, 1, -1, 1, 1], [11, 2043, -1, 1, 1, 1], [11, 2044, -1, 1, -1, -1], [11, 2045, -1, -1, -1, 1], [11, 2046, 1, -1, -1, -1], [11, 2047, 1, 1, 1, -1]], [[3, 0, 0, 0, 0, 0], [4, 2, 1, 0, 0, 0], [5, 6, -1, 0, 0, 0], [5, 7, 0, 0, 0, 1], [5, 8, 0, 0, -1, 0], [5, 9, 0, 0, 0, -1], [5, 10, 0, -1, 0, 0], [5, 11, 0, 0, 1, 0], [5, 12, 0, 1, 0, 0], [6, 26, 0, -1, 1, 0], [6, 27, -1, 1, 0, 0], [6, 28, 0, 1, -1, 0], [6, 29, 0, 0, 1, -1], [6, 30, 0, 1, 0, -1], [6, 31, 0, 0, -1, 1], [6, 32, -1, 0, 0, -1], [6, 33, 1, -1, 0, 0], [6, 34, 1, 0, -1, 0], [6, 35, -1, -1, 0, 0], [6, 36, 0, 0, -1, -1], [6, 37, 1, 0, 1, 0], [6, 38, 1, 0, 0, 1], [6, 39, 0, -1, 0, 1], [6, 40, -1, 0, 1, 0], [6, 41, 0, 1, 0, 1], [6, 42, 0, -1, -1, 0], [6, 43, -1, 0, 0, 1], [6, 44, 0, -1, 0, -1], [6, 45, -1, 0, -1, 0], [6, 46, 1, 1, 0, 0], [6, 47, 0, 1, 1, 0], [6, 48, 0, 0, 1, 1], [6, 49, 1, 0, 0, -1], [7, 100, 0, 1, -1, 1], [7, 101, 1, 0, -1, 1], [7, 102, -1, 1, -1, 0], [7, 103, 0, -1, 1, -1], [7, 104, 1, -1, 1, 0], [7, 105, 1, 1, 0, -1], [7, 106, 1, 0, 1, 1], [7, 107, -1, 1, 1, 0], [7, 108, 0, -1, -1, 1], [7, 109, 1, 1, 1, 0], [7, 110, -1, 0, 1, -1], [7, 111, -1, -1, -1, 0], [7, 112, -1, 0, -1, 1], [7, 113, 1, -1, -1, 0], [7, 114, 1, 1, -1, 0], [8, 230, 1, -1, 0, 1], [8, 231, -1, 1, 0, -1], [8, 232, -1, -1, 1, 0], [8, 233, -1, 0, 1, 1], [8, 234, -1, -1, 0, 1], [8, 235, -1, -1, 0, -1], [8, 236, 0, -1, -1, -1], [8, 237, 1, 0, 1, -1], [8, 238, 1, 0, -1, -1], [8, 239, 0, 1, -1, -1], [8, 240, 0, 1, 1, 1], [8, 241, -1, 1, 0, 1], [8, 242, -1, 0, -1, -1], [8, 243, 0, 1, 1, -1], [8, 244, 1, -1, 0, -1], [8, 245, 0, -1, 1, 1], [8, 246, 1, 1, 0, 1], [8, 247, 1, -1, 1, -1], [8, 248, -1, 1, -1, 1], [9, 498, 1, -1, -1, 1], [9, 499, -1, -1, -1, -1], [9, 500, -1, 1, 1, -1], [9, 501, -1, 1, 1, 1], [9, 502, 1, 1, 1, 1], [9, 503, -1, -1, 1, -1], [9, 504, 1, -1, 1, 1], [9, 505, -1, 1, -1, -1], [9, 506, -1, -1, 1, 1], [9, 507, 1, 1, -1, -1], [9, 508, 1, -1, -1, -1], [9, 509, -1, -1, -1, 1], [9, 510, 1, 1, -1, 1], [9, 511, 1, 1, 1, -1]], [[1, 0, 0, 0, 0, 0], [4, 8, 1, 0, 0, 0], [4, 9, 0, 0, 0, 1], [4, 10, 0, 1, 0, 0], [4, 11, 0, 0, 1, 0], [5, 24, 1, 1, 0, 0], [5, 25, 0, 0, 1, 1], [6, 52, 0, 1, 1, 0], [6, 53, 0, 1, 0, 1], [6, 54, 1, 0, 1, 0], [6, 55, 0, 1, 1, 1], [6, 56, 1, 0, 0, 1], [6, 57, 1, 1, 1, 0], [7, 116, 1, 1, 1, 1], [7, 117, 1, 0, 1, 1], [7, 118, 1, 1, 0, 1], [8, 238, 2, 0, 0, 0], [8, 239, 0, 0, 0, 2], [8, 240, 0, 0, 1, 2], [8, 241, 2, 1, 0, 0], [8, 242, 1, 2, 1, 0], [9, 486, 0, 0, 2, 1], [9, 487, 0, 1, 2, 1], [9, 488, 1, 2, 0, 0], [9, 489, 0, 1, 1, 2], [9, 490, 2, 1, 1, 0], [9, 491, 0, 0, 2, 0], [9, 492, 0, 2, 1, 0], [9, 493, 0, 1, 2, 0], [9, 494, 0, 2, 0, 0], [9, 495, 0, 1, 0, 2], [9, 496, 2, 0, 1, 0], [9, 497, 1, 2, 1, 1], [9, 498, 0, 2, 1, 1], [9, 499, 1, 1, 2, 0], [9, 500, 1, 1, 2, 1], [10, 1002, 1, 2, 0, 1], [10, 1003, 1, 0, 2, 0], [10, 1004, 1, 0, 2, 1], [10, 1005, 0, 2, 0, 1], [10, 1006, 2, 1, 1, 1], [10, 1007, 1, 1, 1, 2], [10, 1008, 2, 1, 0, 1], [10, 1009, 1, 0, 1, 2], [10, 1010, 0, 0, 2, 2], [10, 1011, 0, 1, 2, 2], [10, 1012, 2, 2, 1, 0], [10, 1013, 1, 2, 2, 0], [10, 1014, 1, 0, 0, 2], [10, 1015, 2, 0, 0, 1], [10, 1016, 0, 2, 2, 1], [11, 2034, 2, 2, 0, 0], [11, 2035, 1, 2, 2, 1], [11, 2036, 1, 1, 0, 2], [11, 2037, 2, 0, 1, 1], [11, 2038, 1, 1, 2, 2], [11, 2039, 2, 2, 1, 1], [11, 2040, 0, 2, 2, 0], [11, 2041, 0, 2, 1, 2], [12, 4084, 1, 0, 2, 2], [12, 4085, 2, 2, 0, 1], [12, 4086, 2, 1, 2, 0], [12, 4087, 2, 2, 2, 0], [12, 4088, 0, 2, 2, 2], [12, 4089, 2, 2, 2, 1], [12, 4090, 2, 1, 2, 1], [12, 4091, 1, 2, 1, 2], [12, 4092, 1, 2, 2, 2], [13, 8186, 0, 2, 0, 2], [13, 8187, 2, 0, 2, 0], [13, 8188, 1, 2, 0, 2], [14, 16378, 2, 0, 2, 1], [14, 16379, 2, 1, 1, 2], [14, 16380, 2, 1, 0, 2], [15, 32762, 2, 2, 2, 2], [15, 32763, 2, 2, 1, 2], [15, 32764, 2, 1, 2, 2], [15, 32765, 2, 0, 1, 2], [15, 32766, 2, 0, 0, 2], [16, 65534, 2, 2, 0, 2], [16, 65535, 2, 0, 2, 2]], [[4, 0, 1, 1, 1, 1], [4, 1, 0, 1, 1, 1], [4, 2, 1, 1, 0, 1], [4, 3, 1, 1, 1, 0], [4, 4, 1, 0, 1, 1], [4, 5, 1, 0, 0, 0], [4, 6, 1, 1, 0, 0], [4, 7, 0, 0, 0, 0], [4, 8, 0, 0, 1, 1], [4, 9, 1, 0, 1, 0], [5, 20, 1, 0, 0, 1], [5, 21, 0, 1, 1, 0], [5, 22, 0, 0, 0, 1], [5, 23, 0, 1, 0, 1], [5, 24, 0, 0, 1, 0], [5, 25, 0, 1, 0, 0], [7, 104, 2, 1, 1, 1], [7, 105, 1, 1, 2, 1], [7, 106, 1, 2, 1, 1], [7, 107, 1, 1, 1, 2], [7, 108, 2, 1, 1, 0], [7, 109, 2, 1, 0, 1], [7, 110, 1, 2, 1, 0], [7, 111, 2, 0, 1, 1], [7, 112, 0, 1, 2, 1], [8, 226, 0, 1, 1, 2], [8, 227, 1, 1, 2, 0], [8, 228, 0, 2, 1, 1], [8, 229, 1, 0, 1, 2], [8, 230, 1, 2, 0, 1], [8, 231, 1, 1, 0, 2], [8, 232, 1, 0, 2, 1], [8, 233, 2, 1, 0, 0], [8, 234, 2, 0, 1, 0], [8, 235, 1, 2, 0, 0], [8, 236, 2, 0, 0, 1], [8, 237, 0, 1, 0, 2], [8, 238, 0, 2, 1, 0], [8, 239, 0, 0, 1, 2], [8, 240, 0, 1, 2, 0], [8, 241, 0, 2, 0, 1], [8, 242, 1, 0, 0, 2], [8, 243, 0, 0, 2, 1], [8, 244, 1, 0, 2, 0], [8, 245, 2, 0, 0, 0], [8, 246, 0, 0, 0, 2], [9, 494, 0, 2, 0, 0], [9, 495, 0, 0, 2, 0], [9, 496, 1, 2, 2, 1], [9, 497, 2, 2, 1, 1], [9, 498, 2, 1, 2, 1], [9, 499, 1, 1, 2, 2], [9, 500, 1, 2, 1, 2], [9, 501, 2, 1, 1, 2], [10, 1004, 1, 2, 2, 0], [10, 1005, 2, 2, 1, 0], [10, 1006, 2, 1, 2, 0], [10, 1007, 0, 2, 2, 1], [10, 1008, 0, 1, 2, 2], [10, 1009, 2, 2, 0, 1], [10, 1010, 0, 2, 1, 2], [10, 1011, 2, 0, 2, 1], [10, 1012, 1, 0, 2, 2], [10, 1013, 2, 2, 2, 1], [10, 1014, 1, 2, 0, 2], [10, 1015, 2, 0, 1, 2], [10, 1016, 2, 1, 0, 2], [10, 1017, 1, 2, 2, 2], [11, 2036, 2, 1, 2, 2], [11, 2037, 2, 2, 1, 2], [11, 2038, 0, 2, 2, 0], [11, 2039, 2, 2, 0, 0], [11, 2040, 0, 0, 2, 2], [11, 2041, 2, 0, 2, 0], [11, 2042, 0, 2, 0, 2], [11, 2043, 2, 0, 0, 2], [11, 2044, 2, 2, 2, 2], [11, 2045, 0, 2, 2, 2], [11, 2046, 2, 2, 2, 0], [12, 4094, 2, 2, 0, 2], [12, 4095, 2, 0, 2, 2]], [[1, 0, 0, 0], [4, 8, -1, 0], [4, 9, 1, 0], [4, 10, 0, 1], [4, 11, 0, -1], [5, 24, 1, -1], [5, 25, -1, 1], [5, 26, -1, -1], [5, 27, 1, 1], [7, 112, -2, 0], [7, 113, 0, 2], [7, 114, 2, 0], [7, 115, 0, -2], [8, 232, -2, -1], [8, 233, 2, 1], [8, 234, -1, -2], [8, 235, 1, 2], [8, 236, -2, 1], [8, 237, 2, -1], [8, 238, -1, 2], [8, 239, 1, -2], [8, 240, -3, 0], [8, 241, 3, 0], [8, 242, 0, -3], [8, 243, 0, 3], [9, 488, -3, -1], [9, 489, 1, 3], [9, 490, 3, 1], [9, 491, -1, -3], [9, 492, -3, 1], [9, 493, 3, -1], [9, 494, 1, -3], [9, 495, -1, 3], [9, 496, -2, 2], [9, 497, 2, 2], [9, 498, -2, -2], [9, 499, 2, -2], [10, 1e3, -3, -2], [10, 1001, 3, -2], [10, 1002, -2, 3], [10, 1003, 2, -3], [10, 1004, 3, 2], [10, 1005, 2, 3], [10, 1006, -3, 2], [10, 1007, -2, -3], [10, 1008, 0, -4], [10, 1009, -4, 0], [10, 1010, 4, 1], [10, 1011, 4, 0], [11, 2024, -4, -1], [11, 2025, 0, 4], [11, 2026, 4, -1], [11, 2027, -1, -4], [11, 2028, 1, 4], [11, 2029, -1, 4], [11, 2030, -4, 1], [11, 2031, 1, -4], [11, 2032, 3, -3], [11, 2033, -3, -3], [11, 2034, -3, 3], [11, 2035, -2, 4], [11, 2036, -4, -2], [11, 2037, 4, 2], [11, 2038, 2, -4], [11, 2039, 2, 4], [11, 2040, 3, 3], [11, 2041, -4, 2], [12, 4084, -2, -4], [12, 4085, 4, -2], [12, 4086, 3, -4], [12, 4087, -4, -3], [12, 4088, -4, 3], [12, 4089, 3, 4], [12, 4090, -3, 4], [12, 4091, 4, 3], [12, 4092, 4, -3], [12, 4093, -3, -4], [13, 8188, 4, -4], [13, 8189, -4, 4], [13, 8190, 4, 4], [13, 8191, -4, -4]], [[4, 0, 0, 0], [4, 1, 1, 0], [4, 2, 0, -1], [4, 3, 0, 1], [4, 4, -1, 0], [4, 5, 1, 1], [4, 6, -1, 1], [4, 7, 1, -1], [4, 8, -1, -1], [6, 36, 2, -1], [6, 37, 2, 1], [6, 38, -2, 1], [6, 39, -2, -1], [6, 40, -2, 0], [6, 41, -1, 2], [6, 42, 2, 0], [6, 43, 1, -2], [6, 44, 1, 2], [6, 45, 0, -2], [6, 46, -1, -2], [6, 47, 0, 2], [6, 48, 2, -2], [6, 49, -2, 2], [6, 50, -2, -2], [6, 51, 2, 2], [7, 104, -3, 1], [7, 105, 3, 1], [7, 106, 3, -1], [7, 107, -1, 3], [7, 108, -3, -1], [7, 109, 1, 3], [7, 110, 1, -3], [7, 111, -1, -3], [7, 112, 3, 0], [7, 113, -3, 0], [7, 114, 0, -3], [7, 115, 0, 3], [7, 116, 3, 2], [8, 234, -3, -2], [8, 235, -2, 3], [8, 236, 2, 3], [8, 237, 3, -2], [8, 238, 2, -3], [8, 239, -2, -3], [8, 240, -3, 2], [8, 241, 3, 3], [9, 484, 3, -3], [9, 485, -3, -3], [9, 486, -3, 3], [9, 487, 1, -4], [9, 488, -1, -4], [9, 489, 4, 1], [9, 490, -4, 1], [9, 491, -4, -1], [9, 492, 1, 4], [9, 493, 4, -1], [9, 494, -1, 4], [9, 495, 0, -4], [9, 496, -4, 2], [9, 497, -4, -2], [9, 498, 2, 4], [9, 499, -2, -4], [9, 500, -4, 0], [9, 501, 4, 2], [9, 502, 4, -2], [9, 503, -2, 4], [9, 504, 4, 0], [9, 505, 2, -4], [9, 506, 0, 4], [10, 1014, -3, -4], [10, 1015, -3, 4], [10, 1016, 3, -4], [10, 1017, 4, -3], [10, 1018, 3, 4], [10, 1019, 4, 3], [10, 1020, -4, 3], [10, 1021, -4, -3], [11, 2044, 4, 4], [11, 2045, -4, 4], [11, 2046, -4, -4], [11, 2047, 4, -4]], [[1, 0, 0, 0], [3, 4, 1, 0], [3, 5, 0, 1], [4, 12, 1, 1], [6, 52, 2, 1], [6, 53, 1, 2], [6, 54, 2, 0], [6, 55, 0, 2], [7, 112, 3, 1], [7, 113, 1, 3], [7, 114, 2, 2], [7, 115, 3, 0], [7, 116, 0, 3], [8, 234, 2, 3], [8, 235, 3, 2], [8, 236, 1, 4], [8, 237, 4, 1], [8, 238, 1, 5], [8, 239, 5, 1], [8, 240, 3, 3], [8, 241, 2, 4], [8, 242, 0, 4], [8, 243, 4, 0], [9, 488, 4, 2], [9, 489, 2, 5], [9, 490, 5, 2], [9, 491, 0, 5], [9, 492, 6, 1], [9, 493, 5, 0], [9, 494, 1, 6], [9, 495, 4, 3], [9, 496, 3, 5], [9, 497, 3, 4], [9, 498, 5, 3], [9, 499, 2, 6], [9, 500, 6, 2], [9, 501, 1, 7], [10, 1004, 3, 6], [10, 1005, 0, 6], [10, 1006, 6, 0], [10, 1007, 4, 4], [10, 1008, 7, 1], [10, 1009, 4, 5], [10, 1010, 7, 2], [10, 1011, 5, 4], [10, 1012, 6, 3], [10, 1013, 2, 7], [10, 1014, 7, 3], [10, 1015, 6, 4], [10, 1016, 5, 5], [10, 1017, 4, 6], [10, 1018, 3, 7], [11, 2038, 7, 0], [11, 2039, 0, 7], [11, 2040, 6, 5], [11, 2041, 5, 6], [11, 2042, 7, 4], [11, 2043, 4, 7], [11, 2044, 5, 7], [11, 2045, 7, 5], [12, 4092, 7, 6], [12, 4093, 6, 6], [12, 4094, 6, 7], [12, 4095, 7, 7]], [[3, 0, 1, 1], [4, 2, 2, 1], [4, 3, 1, 0], [4, 4, 1, 2], [4, 5, 0, 1], [4, 6, 2, 2], [5, 14, 0, 0], [5, 15, 2, 0], [5, 16, 0, 2], [5, 17, 3, 1], [5, 18, 1, 3], [5, 19, 3, 2], [5, 20, 2, 3], [6, 42, 3, 3], [6, 43, 4, 1], [6, 44, 1, 4], [6, 45, 4, 2], [6, 46, 2, 4], [6, 47, 3, 0], [6, 48, 0, 3], [6, 49, 4, 3], [6, 50, 3, 4], [6, 51, 5, 2], [7, 104, 5, 1], [7, 105, 2, 5], [7, 106, 1, 5], [7, 107, 5, 3], [7, 108, 3, 5], [7, 109, 4, 4], [7, 110, 5, 4], [7, 111, 0, 4], [7, 112, 4, 5], [7, 113, 4, 0], [7, 114, 2, 6], [7, 115, 6, 2], [7, 116, 6, 1], [7, 117, 1, 6], [8, 236, 3, 6], [8, 237, 6, 3], [8, 238, 5, 5], [8, 239, 5, 0], [8, 240, 6, 4], [8, 241, 0, 5], [8, 242, 4, 6], [8, 243, 7, 1], [8, 244, 7, 2], [8, 245, 2, 7], [8, 246, 6, 5], [8, 247, 7, 3], [8, 248, 1, 7], [8, 249, 5, 6], [8, 250, 3, 7], [9, 502, 6, 6], [9, 503, 7, 4], [9, 504, 6, 0], [9, 505, 4, 7], [9, 506, 0, 6], [9, 507, 7, 5], [9, 508, 7, 6], [9, 509, 6, 7], [10, 1020, 5, 7], [10, 1021, 7, 0], [10, 1022, 0, 7], [10, 1023, 7, 7]], [[1, 0, 0, 0], [3, 4, 1, 0], [3, 5, 0, 1], [4, 12, 1, 1], [6, 52, 2, 1], [6, 53, 1, 2], [6, 54, 2, 0], [6, 55, 0, 2], [7, 112, 3, 1], [7, 113, 2, 2], [7, 114, 1, 3], [8, 230, 3, 0], [8, 231, 0, 3], [8, 232, 2, 3], [8, 233, 3, 2], [8, 234, 1, 4], [8, 235, 4, 1], [8, 236, 2, 4], [8, 237, 1, 5], [9, 476, 4, 2], [9, 477, 3, 3], [9, 478, 0, 4], [9, 479, 4, 0], [9, 480, 5, 1], [9, 481, 2, 5], [9, 482, 1, 6], [9, 483, 3, 4], [9, 484, 5, 2], [9, 485, 6, 1], [9, 486, 4, 3], [10, 974, 0, 5], [10, 975, 2, 6], [10, 976, 5, 0], [10, 977, 1, 7], [10, 978, 3, 5], [10, 979, 1, 8], [10, 980, 8, 1], [10, 981, 4, 4], [10, 982, 5, 3], [10, 983, 6, 2], [10, 984, 7, 1], [10, 985, 0, 6], [10, 986, 8, 2], [10, 987, 2, 8], [10, 988, 3, 6], [10, 989, 2, 7], [10, 990, 4, 5], [10, 991, 9, 1], [10, 992, 1, 9], [10, 993, 7, 2], [11, 1988, 6, 0], [11, 1989, 5, 4], [11, 1990, 6, 3], [11, 1991, 8, 3], [11, 1992, 0, 7], [11, 1993, 9, 2], [11, 1994, 3, 8], [11, 1995, 4, 6], [11, 1996, 3, 7], [11, 1997, 0, 8], [11, 1998, 10, 1], [11, 1999, 6, 4], [11, 2e3, 2, 9], [11, 2001, 5, 5], [11, 2002, 8, 0], [11, 2003, 7, 0], [11, 2004, 7, 3], [11, 2005, 10, 2], [11, 2006, 9, 3], [11, 2007, 8, 4], [11, 2008, 1, 10], [11, 2009, 7, 4], [11, 2010, 6, 5], [11, 2011, 5, 6], [11, 2012, 4, 8], [11, 2013, 4, 7], [11, 2014, 3, 9], [11, 2015, 11, 1], [11, 2016, 5, 8], [11, 2017, 9, 0], [11, 2018, 8, 5], [12, 4038, 10, 3], [12, 4039, 2, 10], [12, 4040, 0, 9], [12, 4041, 11, 2], [12, 4042, 9, 4], [12, 4043, 6, 6], [12, 4044, 12, 1], [12, 4045, 4, 9], [12, 4046, 8, 6], [12, 4047, 1, 11], [12, 4048, 9, 5], [12, 4049, 10, 4], [12, 4050, 5, 7], [12, 4051, 7, 5], [12, 4052, 2, 11], [12, 4053, 1, 12], [12, 4054, 12, 2], [12, 4055, 11, 3], [12, 4056, 3, 10], [12, 4057, 5, 9], [12, 4058, 6, 7], [12, 4059, 8, 7], [12, 4060, 11, 4], [12, 4061, 0, 10], [12, 4062, 7, 6], [12, 4063, 12, 3], [12, 4064, 10, 0], [12, 4065, 10, 5], [12, 4066, 4, 10], [12, 4067, 6, 8], [12, 4068, 2, 12], [12, 4069, 9, 6], [12, 4070, 9, 7], [12, 4071, 4, 11], [12, 4072, 11, 0], [12, 4073, 6, 9], [12, 4074, 3, 11], [12, 4075, 5, 10], [13, 8152, 8, 8], [13, 8153, 7, 8], [13, 8154, 12, 5], [13, 8155, 3, 12], [13, 8156, 11, 5], [13, 8157, 7, 7], [13, 8158, 12, 4], [13, 8159, 11, 6], [13, 8160, 10, 6], [13, 8161, 4, 12], [13, 8162, 7, 9], [13, 8163, 5, 11], [13, 8164, 0, 11], [13, 8165, 12, 6], [13, 8166, 6, 10], [13, 8167, 12, 0], [13, 8168, 10, 7], [13, 8169, 5, 12], [13, 8170, 7, 10], [13, 8171, 9, 8], [13, 8172, 0, 12], [13, 8173, 11, 7], [13, 8174, 8, 9], [13, 8175, 9, 9], [13, 8176, 10, 8], [13, 8177, 7, 11], [13, 8178, 12, 7], [13, 8179, 6, 11], [13, 8180, 8, 11], [13, 8181, 11, 8], [13, 8182, 7, 12], [13, 8183, 6, 12], [14, 16368, 8, 10], [14, 16369, 10, 9], [14, 16370, 8, 12], [14, 16371, 9, 10], [14, 16372, 9, 11], [14, 16373, 9, 12], [14, 16374, 10, 11], [14, 16375, 12, 9], [14, 16376, 10, 10], [14, 16377, 11, 9], [14, 16378, 12, 8], [14, 16379, 11, 10], [14, 16380, 12, 10], [14, 16381, 12, 11], [15, 32764, 10, 12], [15, 32765, 11, 11], [15, 32766, 11, 12], [15, 32767, 12, 12]], [[4, 0, 1, 1], [4, 1, 1, 2], [4, 2, 2, 1], [5, 6, 2, 2], [5, 7, 1, 0], [5, 8, 0, 1], [5, 9, 1, 3], [5, 10, 3, 2], [5, 11, 3, 1], [5, 12, 2, 3], [5, 13, 3, 3], [6, 28, 2, 0], [6, 29, 0, 2], [6, 30, 2, 4], [6, 31, 4, 2], [6, 32, 1, 4], [6, 33, 4, 1], [6, 34, 0, 0], [6, 35, 4, 3], [6, 36, 3, 4], [6, 37, 3, 0], [6, 38, 0, 3], [6, 39, 4, 4], [6, 40, 2, 5], [6, 41, 5, 2], [7, 84, 1, 5], [7, 85, 5, 1], [7, 86, 5, 3], [7, 87, 3, 5], [7, 88, 5, 4], [7, 89, 4, 5], [7, 90, 6, 2], [7, 91, 2, 6], [7, 92, 6, 3], [7, 93, 4, 0], [7, 94, 6, 1], [7, 95, 0, 4], [7, 96, 1, 6], [7, 97, 3, 6], [7, 98, 5, 5], [7, 99, 6, 4], [7, 100, 4, 6], [8, 202, 6, 5], [8, 203, 7, 2], [8, 204, 3, 7], [8, 205, 2, 7], [8, 206, 5, 6], [8, 207, 8, 2], [8, 208, 7, 3], [8, 209, 5, 0], [8, 210, 7, 1], [8, 211, 0, 5], [8, 212, 8, 1], [8, 213, 1, 7], [8, 214, 8, 3], [8, 215, 7, 4], [8, 216, 4, 7], [8, 217, 2, 8], [8, 218, 6, 6], [8, 219, 7, 5], [8, 220, 1, 8], [8, 221, 3, 8], [8, 222, 8, 4], [8, 223, 4, 8], [8, 224, 5, 7], [8, 225, 8, 5], [8, 226, 5, 8], [9, 454, 7, 6], [9, 455, 6, 7], [9, 456, 9, 2], [9, 457, 6, 0], [9, 458, 6, 8], [9, 459, 9, 3], [9, 460, 3, 9], [9, 461, 9, 1], [9, 462, 2, 9], [9, 463, 0, 6], [9, 464, 8, 6], [9, 465, 9, 4], [9, 466, 4, 9], [9, 467, 10, 2], [9, 468, 1, 9], [9, 469, 7, 7], [9, 470, 8, 7], [9, 471, 9, 5], [9, 472, 7, 8], [9, 473, 10, 3], [9, 474, 5, 9], [9, 475, 10, 4], [9, 476, 2, 10], [9, 477, 10, 1], [9, 478, 3, 10], [9, 479, 9, 6], [9, 480, 6, 9], [9, 481, 8, 0], [9, 482, 4, 10], [9, 483, 7, 0], [9, 484, 11, 2], [10, 970, 7, 9], [10, 971, 11, 3], [10, 972, 10, 6], [10, 973, 1, 10], [10, 974, 11, 1], [10, 975, 9, 7], [10, 976, 0, 7], [10, 977, 8, 8], [10, 978, 10, 5], [10, 979, 3, 11], [10, 980, 5, 10], [10, 981, 8, 9], [10, 982, 11, 5], [10, 983, 0, 8], [10, 984, 11, 4], [10, 985, 2, 11], [10, 986, 7, 10], [10, 987, 6, 10], [10, 988, 10, 7], [10, 989, 4, 11], [10, 990, 1, 11], [10, 991, 12, 2], [10, 992, 9, 8], [10, 993, 12, 3], [10, 994, 11, 6], [10, 995, 5, 11], [10, 996, 12, 4], [10, 997, 11, 7], [10, 998, 12, 5], [10, 999, 3, 12], [10, 1e3, 6, 11], [10, 1001, 9, 0], [10, 1002, 10, 8], [10, 1003, 10, 0], [10, 1004, 12, 1], [10, 1005, 0, 9], [10, 1006, 4, 12], [10, 1007, 9, 9], [10, 1008, 12, 6], [10, 1009, 2, 12], [10, 1010, 8, 10], [11, 2022, 9, 10], [11, 2023, 1, 12], [11, 2024, 11, 8], [11, 2025, 12, 7], [11, 2026, 7, 11], [11, 2027, 5, 12], [11, 2028, 6, 12], [11, 2029, 10, 9], [11, 2030, 8, 11], [11, 2031, 12, 8], [11, 2032, 0, 10], [11, 2033, 7, 12], [11, 2034, 11, 0], [11, 2035, 10, 10], [11, 2036, 11, 9], [11, 2037, 11, 10], [11, 2038, 0, 11], [11, 2039, 11, 11], [11, 2040, 9, 11], [11, 2041, 10, 11], [11, 2042, 12, 0], [11, 2043, 8, 12], [12, 4088, 12, 9], [12, 4089, 10, 12], [12, 4090, 9, 12], [12, 4091, 11, 12], [12, 4092, 12, 11], [12, 4093, 0, 12], [12, 4094, 12, 10], [12, 4095, 12, 12]], [[4, 0, 0, 0], [4, 1, 1, 1], [5, 4, 16, 16], [5, 5, 1, 0], [5, 6, 0, 1], [5, 7, 2, 1], [5, 8, 1, 2], [5, 9, 2, 2], [6, 20, 1, 3], [6, 21, 3, 1], [6, 22, 3, 2], [6, 23, 2, 0], [6, 24, 2, 3], [6, 25, 0, 2], [6, 26, 3, 3], [7, 54, 4, 1], [7, 55, 1, 4], [7, 56, 4, 2], [7, 57, 2, 4], [7, 58, 4, 3], [7, 59, 3, 4], [7, 60, 3, 0], [7, 61, 0, 3], [7, 62, 5, 1], [7, 63, 5, 2], [7, 64, 2, 5], [7, 65, 4, 4], [7, 66, 1, 5], [7, 67, 5, 3], [7, 68, 3, 5], [7, 69, 5, 4], [8, 140, 4, 5], [8, 141, 6, 2], [8, 142, 2, 6], [8, 143, 6, 1], [8, 144, 6, 3], [8, 145, 3, 6], [8, 146, 1, 6], [8, 147, 4, 16], [8, 148, 3, 16], [8, 149, 16, 5], [8, 150, 16, 3], [8, 151, 16, 4], [8, 152, 6, 4], [8, 153, 16, 6], [8, 154, 4, 0], [8, 155, 4, 6], [8, 156, 0, 4], [8, 157, 2, 16], [8, 158, 5, 5], [8, 159, 5, 16], [8, 160, 16, 7], [8, 161, 16, 2], [8, 162, 16, 8], [8, 163, 2, 7], [8, 164, 7, 2], [8, 165, 3, 7], [8, 166, 6, 5], [8, 167, 5, 6], [8, 168, 6, 16], [8, 169, 16, 10], [8, 170, 7, 3], [8, 171, 7, 1], [8, 172, 16, 9], [8, 173, 7, 16], [8, 174, 1, 16], [8, 175, 1, 7], [8, 176, 4, 7], [8, 177, 16, 11], [8, 178, 7, 4], [8, 179, 16, 12], [8, 180, 8, 16], [8, 181, 16, 1], [8, 182, 6, 6], [8, 183, 9, 16], [8, 184, 2, 8], [8, 185, 5, 7], [8, 186, 10, 16], [8, 187, 16, 13], [8, 188, 8, 3], [8, 189, 8, 2], [8, 190, 3, 8], [8, 191, 5, 0], [8, 192, 16, 14], [8, 193, 11, 16], [8, 194, 7, 5], [8, 195, 4, 8], [8, 196, 6, 7], [8, 197, 7, 6], [8, 198, 0, 5], [9, 398, 8, 4], [9, 399, 16, 15], [9, 400, 12, 16], [9, 401, 1, 8], [9, 402, 8, 1], [9, 403, 14, 16], [9, 404, 5, 8], [9, 405, 13, 16], [9, 406, 3, 9], [9, 407, 8, 5], [9, 408, 7, 7], [9, 409, 2, 9], [9, 410, 8, 6], [9, 411, 9, 2], [9, 412, 9, 3], [9, 413, 15, 16], [9, 414, 4, 9], [9, 415, 6, 8], [9, 416, 6, 0], [9, 417, 9, 4], [9, 418, 5, 9], [9, 419, 8, 7], [9, 420, 7, 8], [9, 421, 1, 9], [9, 422, 10, 3], [9, 423, 0, 6], [9, 424, 10, 2], [9, 425, 9, 1], [9, 426, 9, 5], [9, 427, 4, 10], [9, 428, 2, 10], [9, 429, 9, 6], [9, 430, 3, 10], [9, 431, 6, 9], [9, 432, 10, 4], [9, 433, 8, 8], [9, 434, 10, 5], [9, 435, 9, 7], [9, 436, 11, 3], [9, 437, 1, 10], [9, 438, 7, 0], [9, 439, 10, 6], [9, 440, 7, 9], [9, 441, 3, 11], [9, 442, 5, 10], [9, 443, 10, 1], [9, 444, 4, 11], [9, 445, 11, 2], [9, 446, 13, 2], [9, 447, 6, 10], [9, 448, 13, 3], [9, 449, 2, 11], [9, 450, 16, 0], [9, 451, 5, 11], [9, 452, 11, 5], [10, 906, 11, 4], [10, 907, 9, 8], [10, 908, 7, 10], [10, 909, 8, 9], [10, 910, 0, 16], [10, 911, 4, 13], [10, 912, 0, 7], [10, 913, 3, 13], [10, 914, 11, 6], [10, 915, 13, 1], [10, 916, 13, 4], [10, 917, 12, 3], [10, 918, 2, 13], [10, 919, 13, 5], [10, 920, 8, 10], [10, 921, 6, 11], [10, 922, 10, 8], [10, 923, 10, 7], [10, 924, 14, 2], [10, 925, 12, 4], [10, 926, 1, 11], [10, 927, 4, 12], [10, 928, 11, 1], [10, 929, 3, 12], [10, 930, 1, 13], [10, 931, 12, 2], [10, 932, 7, 11], [10, 933, 3, 14], [10, 934, 5, 12], [10, 935, 5, 13], [10, 936, 14, 4], [10, 937, 4, 14], [10, 938, 11, 7], [10, 939, 14, 3], [10, 940, 12, 5], [10, 941, 13, 6], [10, 942, 12, 6], [10, 943, 8, 0], [10, 944, 11, 8], [10, 945, 2, 12], [10, 946, 9, 9], [10, 947, 14, 5], [10, 948, 6, 13], [10, 949, 10, 10], [10, 950, 15, 2], [10, 951, 8, 11], [10, 952, 9, 10], [10, 953, 14, 6], [10, 954, 10, 9], [10, 955, 5, 14], [10, 956, 11, 9], [10, 957, 14, 1], [10, 958, 2, 14], [10, 959, 6, 12], [10, 960, 1, 12], [10, 961, 13, 8], [10, 962, 0, 8], [10, 963, 13, 7], [10, 964, 7, 12], [10, 965, 12, 7], [10, 966, 7, 13], [10, 967, 15, 3], [10, 968, 12, 1], [10, 969, 6, 14], [10, 970, 2, 15], [10, 971, 15, 5], [10, 972, 15, 4], [10, 973, 1, 14], [10, 974, 9, 11], [10, 975, 4, 15], [10, 976, 14, 7], [10, 977, 8, 13], [10, 978, 13, 9], [10, 979, 8, 12], [10, 980, 5, 15], [10, 981, 3, 15], [10, 982, 10, 11], [10, 983, 11, 10], [10, 984, 12, 8], [10, 985, 15, 6], [10, 986, 15, 7], [10, 987, 8, 14], [10, 988, 15, 1], [10, 989, 7, 14], [10, 990, 9, 0], [10, 991, 0, 9], [10, 992, 9, 13], [10, 993, 9, 12], [10, 994, 12, 9], [10, 995, 14, 8], [10, 996, 10, 13], [10, 997, 14, 9], [10, 998, 12, 10], [10, 999, 6, 15], [10, 1e3, 7, 15], [11, 2002, 9, 14], [11, 2003, 15, 8], [11, 2004, 11, 11], [11, 2005, 11, 14], [11, 2006, 1, 15], [11, 2007, 10, 12], [11, 2008, 10, 14], [11, 2009, 13, 11], [11, 2010, 13, 10], [11, 2011, 11, 13], [11, 2012, 11, 12], [11, 2013, 8, 15], [11, 2014, 14, 11], [11, 2015, 13, 12], [11, 2016, 12, 13], [11, 2017, 15, 9], [11, 2018, 14, 10], [11, 2019, 10, 0], [11, 2020, 12, 11], [11, 2021, 9, 15], [11, 2022, 0, 10], [11, 2023, 12, 12], [11, 2024, 11, 0], [11, 2025, 12, 14], [11, 2026, 10, 15], [11, 2027, 13, 13], [11, 2028, 0, 13], [11, 2029, 14, 12], [11, 2030, 15, 10], [11, 2031, 15, 11], [11, 2032, 11, 15], [11, 2033, 14, 13], [11, 2034, 13, 0], [11, 2035, 0, 11], [11, 2036, 13, 14], [11, 2037, 15, 12], [11, 2038, 15, 13], [11, 2039, 12, 15], [11, 2040, 14, 0], [11, 2041, 14, 14], [11, 2042, 13, 15], [11, 2043, 12, 0], [11, 2044, 14, 15], [12, 4090, 0, 14], [12, 4091, 0, 12], [12, 4092, 15, 14], [12, 4093, 15, 0], [12, 4094, 0, 15], [12, 4095, 15, 15]]], s = [!1, !1, !0, !0, !1, !1, !0, !0, !0, !0, !0];
        var o = {
            findOffset: function (t, e) {
                for (var r = 0, i = e[r][0], n = t.read(i); n !== e[r][1];) {
                    var s = e[++r][0] - i;
                    i = e[r][0], n <<= s, n |= t.read(s)
                }
                return r
            }, signValues: function (t, e, r, i) {
                for (var n = r; n < r + i; n++)e[n] && t.read(1) && (e[n] = -e[n])
            }, getEscape: function (t, e) {
                for (var r = 4; t.read(1);)r++;
                var i = t.read(r) | 1 << r;
                return e < 0 ? -i : i
            }, decodeScaleFactor: function (t) {
                var e = this.findOffset(t, i);
                return i[e][2]
            }, decodeSpectralData: function (t, e, r, i) {
                var o = n[e - 1], a = this.findOffset(t, o);
                if (r[i] = o[a][2], r[i + 1] = o[a][3], e < 5 && (r[i + 2] = o[a][4], r[i + 3] = o[a][5]), e < 11)s[e - 1] && this.signValues(t, r, i, e < 5 ? 4 : 2); else {
                    if (!(11 === e || e > 15))throw new Error("Huffman: unknown spectral codebook: " + e);
                    this.signValues(t, r, i, e < 5 ? 4 : 2), 16 === Math.abs(r[i]) && (r[i] = this.getEscape(t, r[i])), 16 === Math.abs(r[i + 1]) && (r[i + 1] = this.getEscape(t, r[i + 1]))
                }
            }
        };
        e.exports = o
    }, {}],
    8: [function (t, e, r) {
        function i(t) {
            this.info = new n, this.bandTypes = new Int32Array(h), this.sectEnd = new Int32Array(h), this.data = new Float32Array(t.frameLength), this.scaleFactors = new Float32Array(h), this.randomState = 523124044, this.tns = new a(t), this.specBuf = new Int32Array(4)
        }

        function n() {
            this.windowShape = new Int32Array(2), this.windowSequence = i.ONLY_LONG_SEQUENCE, this.groupLength = new Int32Array(f), this.ltpData1Present = !1, this.ltpData2Present = !1
        }

        var s = t("./tables"), o = t("./huffman"), a = t("./tns");
        i.ZERO_BT = 0, i.FIRST_PAIR_BT = 5, i.ESC_BT = 11, i.NOISE_BT = 13, i.INTENSITY_BT2 = 14, i.INTENSITY_BT = 15, i.ONLY_LONG_SEQUENCE = 0, i.LONG_START_SEQUENCE = 1, i.EIGHT_SHORT_SEQUENCE = 2, i.LONG_STOP_SEQUENCE = 3;
        const h = 120, f = 8;
        i.prototype = {
            decode: function (t, e, r) {
                if (this.globalGain = t.read(8), r || this.info.decode(t, e, r), this.decodeBandTypes(t, e), this.decodeScaleFactors(t), this.pulsePresent = t.read(1)) {
                    if (this.info.windowSequence === i.EIGHT_SHORT_SEQUENCE)throw new Error("Pulse tool not allowed in eight short sequence.");
                    this.decodePulseData(t)
                }
                if ((this.tnsPresent = t.read(1)) && this.tns.decode(t, this.info), this.gainPresent = t.read(1))throw new Error("TODO: decode gain control/SSR");
                this.decodeSpectralData(t)
            }, decodeBandTypes: function (t, e) {
                for (var r = this.info.windowSequence === i.EIGHT_SHORT_SEQUENCE ? 3 : 5, n = this.info.groupCount, s = this.info.maxSFB, o = this.bandTypes, a = this.sectEnd, h = 0, f = (1 << r) - 1, c = 0; c < n; c++)for (var u = 0; u < s;) {
                    var l = u, d = t.read(4);
                    if (12 === d)throw new Error("Invalid band type: 12");
                    for (var p; (p = t.read(r)) === f;)l += p;
                    if ((l += p) > s)throw new Error("Too many bands (" + l + " > " + s + ")");
                    for (; u < l; u++)o[h] = d, a[h++] = l
                }
            }, decodeScaleFactors: function (t) {
                for (var e = this.info.groupCount, r = this.info.maxSFB, n = [this.globalGain, this.globalGain - 90, 0], a = 0, h = !0, f = this.scaleFactors, c = this.sectEnd, u = this.bandTypes, l = 0; l < e; l++)for (var d = 0; d < r;) {
                    var p = c[a];
                    switch (u[a]) {
                        case i.ZERO_BT:
                            for (; d < p; d++, a++)f[a] = 0;
                            break;
                        case i.INTENSITY_BT:
                        case i.INTENSITY_BT2:
                            for (; d < p; d++, a++) {
                                n[2] += o.decodeScaleFactor(t) - 60;
                                w = Math.min(Math.max(n[2], -155), 100);
                                f[a] = s.SCALEFACTOR_TABLE[200 - w]
                            }
                            break;
                        case i.NOISE_BT:
                            for (; d < p; d++, a++) {
                                h ? (n[1] += t.read(9) - 256, h = !1) : n[1] += o.decodeScaleFactor(t) - 60;
                                var w = Math.min(Math.max(n[1], -100), 155);
                                f[a] = -s.SCALEFACTOR_TABLE[w + 200]
                            }
                            break;
                        default:
                            for (; d < p; d++, a++) {
                                if (n[0] += o.decodeScaleFactor(t) - 60, n[0] > 255)throw new Error("Scalefactor out of range: " + n[0]);
                                f[a] = s.SCALEFACTOR_TABLE[n[0] - 100 + 200]
                            }
                    }
                }
            }, decodePulseData: function (t) {
                var e = t.read(2) + 1, r = t.read(6);
                if (r >= this.info.swbCount)throw new Error("Pulse SWB out of range: " + r);
                if (this.pulseOffset && this.pulseOffset.length === e || (this.pulseOffset = new Int32Array(e), this.pulseAmp = new Int32Array(e)), this.pulseOffset[0] = this.info.swbOffsets[r] + t.read(5), this.pulseAmp[0] = t.read(4), this.pulseOffset[0] > 1023)throw new Error("Pulse offset out of range: " + this.pulseOffset[0]);
                for (var i = 1; i < e; i++) {
                    if (this.pulseOffset[i] = t.read(5) + this.pulseOffset[i - 1], this.pulseOffset[i] > 1023)throw new Error("Pulse offset out of range: " + this.pulseOffset[i]);
                    this.pulseAmp[i] = t.read(4)
                }
            }, decodeSpectralData: function (t) {
                for (var e = this.data, r = this.info, n = r.maxSFB, a = r.groupCount, h = r.swbOffsets, f = this.bandTypes, c = this.scaleFactors, u = this.specBuf, l = 0, d = 0, p = 0; p < a; p++) {
                    for (var w = r.groupLength[p], m = 0; m < n; m++, d++) {
                        var v = f[d], y = l + h[m], g = h[m + 1] - h[m];
                        if (v === i.ZERO_BT || v === i.INTENSITY_BT || v === i.INTENSITY_BT2)for (A = 0; A < w; A++, y += 128)for (var b = y; b < y + g; b++)e[b] = 0; else if (v === i.NOISE_BT)for (A = 0; A < w; A++, y += 128) {
                            for (var I = 0, k = 0; k < g; k++)this.randomState = 1015568748 * this.randomState | 0, e[y + k] = this.randomState, I += e[y + k] * e[y + k];
                            for (var E = c[d] / Math.sqrt(I), k = 0; k < g; k++)e[y + k] *= E
                        } else for (var A = 0; A < w; A++, y += 128)for (var S = v >= i.FIRST_PAIR_BT ? 2 : 4, k = 0; k < g; k += S) {
                            o.decodeSpectralData(t, v, u, 0);
                            for (var _ = 0; _ < S; _++)e[y + k + _] = u[_] > 0 ? s.IQ_TABLE[u[_]] : -s.IQ_TABLE[-u[_]], e[y + k + _] *= c[d]
                        }
                    }
                    l += w << 7
                }
                if (this.pulsePresent)throw new Error("TODO: add pulse data")
            }
        }, n.prototype = {
            decode: function (t, e, r) {
                if (t.advance(1), this.windowSequence = t.read(2), this.windowShape[0] = this.windowShape[1], this.windowShape[1] = t.read(1), this.groupCount = 1, this.groupLength[0] = 1, this.windowSequence === i.EIGHT_SHORT_SEQUENCE) {
                    this.maxSFB = t.read(4);
                    for (var n = 0; n < 7; n++)t.read(1) ? this.groupLength[this.groupCount - 1]++ : (this.groupCount++, this.groupLength[this.groupCount - 1] = 1);
                    this.windowCount = 8, this.swbOffsets = s.SWB_OFFSET_128[e.sampleIndex], this.swbCount = s.SWB_SHORT_WINDOW_COUNT[e.sampleIndex], this.predictorPresent = !1
                } else this.maxSFB = t.read(6), this.windowCount = 1, this.swbOffsets = s.SWB_OFFSET_1024[e.sampleIndex], this.swbCount = s.SWB_LONG_WINDOW_COUNT[e.sampleIndex], this.predictorPresent = !!t.read(1), this.predictorPresent && this.decodePrediction(t, e, r)
            }, decodePrediction: function (t, e, r) {
                throw new Error("Prediction not implemented.")
            }
        }, e.exports = i
    }, {"./huffman": 7, "./tables": 11, "./tns": 12}],
    9: [function (t, e, r) {
        function i(t) {
            switch (this.N = t, this.N2 = t >>> 1, this.N4 = t >>> 2, this.N8 = t >>> 3, t) {
                case 2048:
                    this.sincos = n.MDCT_TABLE_2048;
                    break;
                case 256:
                    this.sincos = n.MDCT_TABLE_256;
                    break;
                case 1920:
                    this.sincos = n.MDCT_TABLE_1920;
                    break;
                case 240:
                    this.sincos = n.MDCT_TABLE_240;
                    break;
                default:
                    throw new Error("unsupported MDCT length: " + t)
            }
            this.fft = new s(this.N4), this.buf = new Array(this.N4);
            for (var e = 0; e < this.N4; e++)this.buf[e] = new Float32Array(2);
            this.tmp = new Float32Array(2)
        }

        var n = t("./mdct_tables"), s = t("./fft");
        i.prototype.process = function (t, e, r, i) {
            for (var n = this.N2, s = this.N4, o = this.N8, a = this.buf, h = this.tmp, f = this.sincos, c = this.fft, u = 0; u < s; u++)a[u][1] = t[e + 2 * u] * f[u][0] + t[e + n - 1 - 2 * u] * f[u][1], a[u][0] = t[e + n - 1 - 2 * u] * f[u][0] - t[e + 2 * u] * f[u][1];
            c.process(a, !1);
            for (u = 0; u < s; u++)h[0] = a[u][0], h[1] = a[u][1], a[u][1] = h[1] * f[u][0] + h[0] * f[u][1], a[u][0] = h[0] * f[u][0] - h[1] * f[u][1];
            for (u = 0; u < o; u += 2)r[i + 2 * u] = a[o + u][1], r[i + 2 + 2 * u] = a[o + 1 + u][1], r[i + 1 + 2 * u] = -a[o - 1 - u][0], r[i + 3 + 2 * u] = -a[o - 2 - u][0], r[i + s + 2 * u] = a[u][0], r[i + s + 2 + 2 * u] = a[1 + u][0], r[i + s + 1 + 2 * u] = -a[s - 1 - u][1], r[i + s + 3 + 2 * u] = -a[s - 2 - u][1], r[i + n + 2 * u] = a[o + u][0], r[i + n + 2 + 2 * u] = a[o + 1 + u][0], r[i + n + 1 + 2 * u] = -a[o - 1 - u][1], r[i + n + 3 + 2 * u] = -a[o - 2 - u][1], r[i + n + s + 2 * u] = -a[u][1], r[i + n + s + 2 + 2 * u] = -a[1 + u][1], r[i + n + s + 1 + 2 * u] = a[s - 1 - u][0], r[i + n + s + 3 + 2 * u] = a[s - 2 - u][0]
        }, e.exports = i
    }, {"./fft": 5, "./mdct_tables": 10}],
    10: [function (t, e, r) {
        r.MDCT_TABLE_2048 = [[.031249997702054, 11984224612e-15], [.031249813866531, .000107857810004], [.031249335895858, .000203730380198], [.031248563794535, .000299601032804], [.031247497569829, .000395468865451], [.031246137231775, .000491332975794], [.031244482793177, .000587192461525], [.031242534269608, .000683046420376], [.031240291679407, .000778893950134], [.031237755043684, .000874734148645], [.031234924386313, .000970566113826], [.031231799733938, .001066388943669], [.03122838111597, .001162201736253], [.031224668564585, .001258003589751], [.031220662114728, .001353793602441], [.031216361804108, .00144957087271], [.031211767673203, .001545334499065], [.031206879765253, .001641083580144], [.031201698126266, .001736817214719], [.031196222805014, .001832534501709], [.031190453853031, .001928234540186], [.031184391324617, .002023916429386], [.031178035276836, .002119579268713], [.031171385769513, .002215222157753], [.031164442865236, .002310844196278], [.031157206629353, .002406444484258], [.031149677129975, .002502022121865], [.031141854437973, .002597576209488], [.031133738626977, .002693105847734], [.031125329773375, .002788610137442], [.031116627956316, .002884088179689], [.031107633257703, .002979539075801], [.0310983457622, .003074961927355], [.031088765557222, .003170355836197], [.031078892732942, .003265719904442], [.031068727382288, .003361053234488], [.031058269600939, .003456354929021], [.031047519487329, .003551624091024], [.03103647714264, .00364685982379], [.031025142670809, .003742061230921], [.031013516178519, .003837227416347], [.031001597775203, .003932357484328], [.030989387573042, .004027450539462], [.030976885686963, .004122505686697], [.030964092234638, .00421752203134], [.030951007336485, .004312498679058], [.030937631115663, .004407434735897], [.030923963698074, .004502329308281], [.030910005212362, .004597181503027], [.030895755789908, .00469199042735], [.030881215564835, .004786755188872], [.030866384674, .004881474895632], [.030851263256996, .00497614865609], [.030835851456154, .005070775579142], [.030820149416533, .005165354774124], [.030804157285929, .005259885350819], [.030787875214864, .005354366419469], [.030771303356593, .005448797090784], [.030754441867095, .005543176475946], [.030737290905077, .005637503686619], [.030719850631972, .005731777834961], [.030702121211932, .005825998033626], [.030684102811835, .00592016339578], [.030665795601276, .006014273035101], [.03064719975257, .006108326065793], [.030628315440748, .006202321602594], [.030609142843557, .006296258760782], [.030589682141455, .006390136656185], [.030569933517616, .006483954405188], [.030549897157919, .006577711124743], [.030529573250956, .006671405932375], [.030508961988022, .006765037946194], [.030488063563118, .0068586062849], [.030466878172949, .006952110067791], [.030445406016919, .007045548414774], [.030423647297133, .007138920446372], [.030401602218392, .007232225283733], [.030379270988192, .007325462048634], [.030356653816724, .007418629863497], [.030333750916869, .00751172785139], [.030310562504198, .00760475513604], [.030287088796968, .007697710841838], [.030263330016124, .007790594093851], [.030239286385293, .007883404017824], [.030214958130781, .007976139740197], [.030190345481576, .008068800388104], [.030165448669342, .00816138508939], [.030140267928416, .00825389297261], [.030114803495809, .008346323167047], [.030089055611203, .008438674802711], [.030063024516947, .008530947010354], [.030036710458054, .008623138921475], [.030010113682202, .008715249668328], [.029983234439732, .008807278383932], [.02995607298364, .008899224202078], [.02992862956958, .008991086257336], [.02990090445586, .009082863685067], [.029872897903441, .009174555621425], [.029844610175929, .009266161203371], [.029816041539579, .009357679568679], [.029787192263292, .009449109855944], [.029758062618606, .009540451204587], [.029728652879702, .009631702754871], [.029698963323395, .0097228636479], [.029668994229134, .009813933025633], [.029638745879, .009904910030891], [.029608218557702, .009995793807363], [.029577412552575, .010086583499618], [.029546328153577, .010177278253107], [.029514965653285, .010267877214177], [.029483325346896, .010358379530076], [.02945140753222, .010448784348962], [.029419212509679, .010539090819911], [.029386740582307, .010629298092923], [.02935399205574, .010719405318933], [.02932096723822, .010809411649818], [.02928766644059, .010899316238403], [.02925408997629, .010989118238474], [.029220238161353, .011078816804778], [.029186111314406, .011168411093039], [.029151709756664, .011257900259961], [.029117033811927, .011347283463239], [.029082083806579, .011436559861563], [.029046860069582, .01152572861463], [.029011362932476, .01161478888315], [.028975592729373, .011703739828853], [.028939549796957, .0117925806145], [.028903234474475, .011881310403886], [.028866647103744, .011969928361855], [.028829788029135, .012058433654299], [.028792657597583, .012146825448172], [.028755256158571, .012235102911499], [.028717584064137, .012323265213377], [.028679641668864, .01241131152399], [.028641429329882, .012499241014612], [.028602947406859, .012587052857618], [.028564196262001, .012674746226488], [.02852517626005, .012762320295819], [.028485887768276, .012849774241331], [.028446331156478, .012937107239875], [.028406506796976, .013024318469437], [.028366415064615, .013111407109155], [.028326056336751, .013198372339315], [.028285430993258, .013285213341368], [.028244539416515, .013371929297933], [.028203381991411, .013458519392807], [.028161959105334, .013544982810971], [.028120271148172, .013631318738598], [.028078318512309, .013717526363062], [.028036101592619, .013803604872943], [.027993620786463, .013889553458039], [.027950876493687, .013975371309367], [.027907869116616, .014061057619178], [.027864599060052, .014146611580959], [.02782106673127, .014232032389445], [.027777272540012, .014317319240622], [.027733216898487, .014402471331737], [.027688900221361, .014487487861307], [.027644322925762, .014572368029123], [.027599485431266, .014657111036262], [.027554388159903, .01474171608509], [.027509031536144, .014826182379271], [.027463415986904, .014910509123778], [.027417541941533, .014994695524894], [.027371409831816, .015078740790225], [.027325020091965, .015162644128704], [.027278373158618, .015246404750603], [.027231469470833, .015330021867534], [.027184309470088, .01541349469246], [.027136893600268, .015496822439704], [.027089222307671, .015580004324954], [.027041296040997, .015663039565269], [.026993115251345, .015745927379091], [.026944680392213, .015828666986247], [.026895991919487, .015911257607961], [.026847050291442, .015993698466859], [.026797855968734, .016075988786976], [.026748409414401, .016158127793763], [.026698711093851, .016240114714099], [.026648761474864, .016321948776289], [.026598561027585, .016403629210082], [.026548110224519, .016485155246669], [.02649740954053, .016566526118696], [.02644645945283, .016647741060271], [.026395260440982, .016728799306966], [.02634381298689, .016809700095831], [.026292117574797, .016890442665397], [.02624017469128, .016971026255683], [.026187984825246, .017051450108208], [.026135548467924, .01713171346599], [.026082866112867, .01721181557356], [.026029938255941, .017291755676967], [.025976765395322, .017371533023784], [.025923348031494, .017451146863116], [.025869686667242, .017530596445607], [.025815781807646, .017609881023449], [.02576163396008, .017688999850383], [.025707243634204, .017767952181715], [.02565261134196, .017846737274313], [.025597737597568, .017925354386623], [.025542622917522, .018003802778671], [.025487267820581, .018082081712071], [.025431672827768, .018160190450031], [.025375838462365, .018238128257362], [.025319765249906, .018315894400484], [.025263453718173, .018393488147432], [.025206904397193, .018470908767865], [.025150117819228, .01854815553307], [.025093094518776, .018625227715971], [.025035835032562, .018702124591135], [.024978339899534, .01877884543478], [.024920609660858, .01885538952478], [.024862644859912, .018931756140672], [.024804446042284, .019007944563666], [.024746013755764, .019083954076646], [.024687348550337, .019159783964183], [.024628450978184, .019235433512536], [.02456932159367, .019310902009663], [.024509960953345, .019386188745225], [.024450369615932, .019461293010596], [.024390548142329, .019536214098866], [.024330497095598, .019610951304848], [.024270217040961, .019685503925087], [.024209708545799, .019759871257867], [.024148972179639, .019834052603212], [.024088008514157, .019908047262901], [.024026818123164, .019981854540467], [.023965401582609, .020055473741208], [.023903759470567, .020128904172192], [.023841892367236, .020202145142264], [.023779800854935, .020275195962052], [.023717485518092, .020348055943974], [.023654946943242, .020420724402244], [.023592185719023, .020493200652878], [.023529202436167, .020565484013703], [.023465997687496, .020637573804361], [.023402572067918, .020709469346314], [.023338926174419, .020781169962854], [.023275060606058, .020852674979108], [.023210975963963, .020923983722044], [.023146672851322, .020995095520475], [.02308215187338, .021066009705072], [.023017413637435, .021136725608363], [.022952458752826, .021207242564742], [.022887287830934, .021277559910478], [.022821901485173, .021347676983716], [.022756300330983, .021417593124488], [.022690484985827, .021487307674717], [.022624456069185, .021556819978223], [.022558214202547, .021626129380729], [.022491760009405, .021695235229869], [.022425094115252, .021764136875192], [.022358217147572, .021832833668171], [.022291129735838, .021901324962204], [.022223832511501, .021969610112625], [.022156326107988, .022037688476709], [.022088611160696, .022105559413676], [.022020688306983, .022173222284699], [.021952558186166, .022240676452909], [.02188422143951, .022307921283403], [.021815678710228, .022374956143245], [.021746930643469, .022441780401478], [.021677977886316, .022508393429127], [.02160882108778, .022574794599206], [.02153946089879, .022640983286719], [.02146989797219, .022706958868676], [.021400132962735, .022772720724087], [.021330166527077, .022838268233979], [.021259999323769, .022903600781391], [.02118963201325, .022968717751391], [.021119065257845, .023033618531071], [.021048299721754, .023098302509561], [.02097733607105, .023162769078031], [.02090617497367, .023227017629698], [.020834817099409, .023291047559828], [.020763263119915, .023354858265748], [.02069151370868, .023418449146848], [.020619569541038, .023481819604585], [.020547431294155, .023544969042494], [.020475099647023, .023607896866186], [.020402575280455, .023670602483363], [.020329858877078, .023733085303813], [.020256951121327, .023795344739427], [.020183852699437, .023857380204193], [.020110564299439, .023919191114211], [.02003708661115, .023980776887692], [.019963420326171, .024042136944968], [.019889566137877, .024103270708495], [.019815524741412, .024164177602859], [.019741296833681, .024224857054779], [.019666883113346, .02428530849312], [.019592284280817, .024345531348888], [.019517501038246, .024405525055242], [.019442534089523, .0244652890475], [.019367384140264, .024524822763141], [.019292051897809, .024584125641809], [.019216538071215, .024643197125323], [.019140843371246, .024702036657681], [.019064968510369, .024760643685063], [.018988914202748, .024819017655836], [.018912681164234, .024877158020562], [.018836270112363, .024935064232003], [.018759681766343, .024992735745123], [.018682916847054, .025050172017095], [.018605976077037, .025107372507308], [.018528860180486, .025164336677369], [.018451569883247, .02522106399111], [.018374105912805, .025277553914591], [.01829646899828, .025333805916107], [.018218659870421, .025389819466194], [.018140679261596, .02544559403763], [.01806252790579, .025501129105445], [.017984206538592, .02555642414692], [.017905715897192, .025611478641598], [.017827056720375, .025666292071285], [.017748229748511, .025720863920056], [.01766923572355, .02577519367426], [.017590075389012, .025829280822525], [.017510749489986, .025883124855762], [.017431258773116, .02593672526717], [.0173516039866, .025990081552242], [.01727178588018, .026043193208768], [.017191805205132, .026096059736841], [.017111662714267, .026148680638861], [.017031359161915, .026201055419541], [.016950895303924, .026253183585908], [.016870271897651, .026305064647313], [.016789489701954, .026356698115431], [.016708549477186, .026408083504269], [.016627451985187, .026459220330167], [.016546197989277, .026510108111806], [.01646478825425, .026560746370212], [.016383223546365, .026611134628757], [.016301504633341, .026661272413168], [.016219632284346, .02671115925153], [.016137607269996, .026760794674288], [.01605543036234, .026810178214254], [.015973102334858, .026859309406613], [.015890623962454, .026908187788922], [.015807996021446, .026956812901119], [.015725219289558, .027005184285527], [.015642294545918, .027053301486856], [.015559222571044, .027101164052208], [.015476004146842, .027148771531083], [.015392640056594, .02719612347538], [.015309131084956, .027243219439406], [.015225478017946, .027290058979875], [.015141681642938, .027336641655915], [.015057742748656, .027382967029073], [.014973662125164, .027429034663317], [.014889440563862, .02747484412504], [.014805078857474, .027520394983066], [.014720577800046, .027565686808654], [.014635938186934, .027610719175499], [.014551160814797, .02765549165974], [.014466246481592, .02770000383996], [.014381195986567, .027744255297195], [.014296010130247, .027788245614933], [.014210689714436, .02783197437912], [.014125235542201, .027875441178165], [.01403964841787, .027918645602941], [.01395392914702, .027961587246792], [.013868078536476, .028004265705534], [.013782097394294, .028046680577462], [.013695986529763, .028088831463351], [.01360974675339, .028130717966461], [.013523378876898, .02817233969254], [.013436883713214, .028213696249828], [.013350262076462, .028254787249062], [.01326351478196, .028295612303478], [.013176642646205, .028336171028814], [.013089646486871, .028376463043317], [.013002527122799, .028416487967743], [.01291528537399, .028456245425361], [.012827922061597, .02849573504196], [.012740438007915, .028534956445849], [.012652834036379, .028573909267859], [.01256511097155, .028612593141354], [.012477269639111, .028651007702224], [.012389310865858, .028689152588899], [.012301235479693, .028727027442343], [.012213044309615, .028764631906065], [.012124738185712, .028801965626115], [.012036317939156, .028839028251097], [.011947784402191, .028875819432161], [.01185913840813, .028912338823015], [.011770380791341, .028948586079925], [.011681512387245, .028984560861718], [.011592534032306, .029020262829785], [.011503446564022, .029055691648087], [.011414250820918, .029090846983152], [.011324947642537, .029125728504087], [.011235537869437, .029160335882573], [.011146022343175, .029194668792871], [.011056401906305, .029228726911828], [.010966677402371, .029262509918876], [.010876849675891, .029296017496036], [.010786919572361, .029329249327922], [.010696887938235, .029362205101743], [.010606755620926, .029394884507308], [.010516523468793, .029427287237024], [.010426192331137, .029459412985906], [.010335763058187, .029491261451573], [.010245236501099, .029522832334255], [.010154613511943, .029554125336796], [.010063894943698, .029585140164654], [.00997308165024, .029615876525905], [.00988217448634, .029646334131247], [.00979117430765, .029676512694001], [.009700081970699, .029706411930116], [.009608898332881, .029736031558168], [.009517624252453, .029765371299366], [.009426260588521, .029794430877553], [.009334808201034, .02982321001921], [.009243267950778, .029851708453456], [.009151640699363, .029879925912053], [.00905992730922, .029907862129408], [.008968128643591, .029935516842573], [.00887624556652, .029962889791254], [.008784278942845, .029989980717805], [.008692229638191, .030016789367235], [.008600098518961, .030043315487212], [.008507886452329, .030069558828062], [.00841559430623, .030095519142772], [.008323222949351, .030121196186994], [.008230773251129, .030146589719046], [.008138246081733, .030171699499915], [.008045642312067, .030196525293257], [.00795296281375, .030221066865402], [.007860208459119, .030245323985357], [.007767380121212, .030269296424803], [.007674478673766, .030292983958103], [.007581504991203, .030316386362302], [.007488459948628, .030339503417126], [.007395344421816, .030362334904989], [.007302159287206, .030384880610993], [.007208905421891, .030407140322928], [.007115583703613, .030429113831278], [.007022195010752, .03045080092922], [.006928740222316, .030472201412626], [.006835220217939, .030493315080068], [.006741635877866, .030514141732814], [.006647988082948, .030534681174838], [.006554277714635, .030554933212813], [.006460505654964, .030574897656119], [.006366672786553, .030594574316845], [.006272779992593, .030613963009786], [.006178828156839, .030633063552447], [.006084818163601, .030651875765048], [.005990750897737, .03067039947052], [.005896627244644, .030688634494512], [.00580244809025, .030706580665388], [.005708214321004, .030724237814232], [.005613926823871, .030741605774849], [.005519586486321, .030758684383764], [.005425194196321, .030775473480228], [.005330750842327, .030791972906214], [.005236257313276, .030808182506425], [.005141714498576, .030824102128288], [.005047123288102, .030839731621963], [.004952484572181, .030855070840339], [.004857799241589, .030870119639036], [.004763068187541, .030884877876411], [.004668292301681, .030899345413553], [.004573472476075, .030913522114288], [.004478609603205, .03092740784518], [.004383704575956, .03094100247553], [.00428875828761, .030954305877381], [.004193771631837, .030967317925516], [.004098745502689, .030980038497461], [.004003680794587, .030992467473486], [.003908578402316, .031004604736602], [.003813439221017, .031016450172571], [.003718264146176, .031028003669899], [.003623054073616, .031039265119839], [.003527809899492, .031050234416394], [.003432532520278, .031060911456318], [.00333722283276, .031071296139114], [.003241881734029, .031081388367037], [.003146510121474, .031091188045095], [.003051108892766, .031100695081051], [.00295567894586, .031109909385419], [.002860221178978, .031118830871473], [.002764736490604, .031127459455239], [.002669225779478, .031135795055501], [.002573689944583, .031143837593803], [.002478129885137, .031151586994444], [.002382546500589, .031159043184484], [.002286940690606, .031166206093743], [.002191313355067, .0311730756548], [.002095665394051, .031179651802998], [.001999997707835, .031185934476438], [.001904311196878, .031191923615985], [.00180860676182, .031197619165268], [.001712885303465, .031203021070678], [.001617147722782, .03120812928137], [.001521394920889, .031212943749264], [.001425627799047, .031217464429043], [.001329847258653, .031221691278159], [.001234054201231, .031225624256825], [.00113824952842, .031229263328024], [.001042434141971, .031232608457502], [.000946608943736, .031235659613775], [.000850774835656, .031238416768124], [.000754932719759, .031240879894597], [.000659083498149, .03124304897001], [.000563228072993, .031244923973948], [.00046736734652, .031246504888762], [.000371502221008, .031247791699571], [.000275633598775, .031248784394264], [.000179762382174, .031249482963498], [83889473581e-15, .031249887400697]], r.MDCT_TABLE_256 = [[.088387931675923, .000271171628935], [.088354655998507, .002440238387037], [.08826815878011, .00460783523678], [.088128492123423, .006772656498875], [.087935740158418, .008933398165942], [.08769001899167, .011088758687994], [.087391476636423, .013237439756448], [.087040292923427, .015378147086172], [.086636679392621, .017509591195118], [.086180879165703, .019630488181053], [.085673166799686, .02173956049494], [.085113848121515, .023835537710479], [.084503260043847, .025917157289369], [.08384177036211, .027983165341813], [.083129777532952, .030032317381813], [.08236771043423, .032063379076803], [.081556028106671, .034075126991164], [.080695219477356, .036066349323177], [.079785803065216, .038035846634965], [.078828326668693, .039982432574992], [.077823367035766, .041904934592675], [.07677152951654, .043802194644686], [.075673447698606, .045673069892513], [.07452978302539, .047516433390863], [.073341224397728, .049331174766491], [.072108487758894, .051116200887052], [.070832315663343, .052870436519557], [.069513476829429, .054592824978055], [.068152765676348, .056282328760143], [.06675100184562, .057937930171918], [.065309029707361, .059558631940996], [.063827717851668, .061143457817234], [.062307958565413, .062691453160784], [.060750667294763, .064201685517134], [.059156782093749, .065673245178784], [.057527263059216, .06710524573322], [.055863091752499, .068496824596852], [.054165270608165, .069847143534609], [.052434822330188, .071155389164853], [.050672789275903, .072420773449336], [.048880232828135, .073642534167879], [.047058232755862, .074819935377512], [.045207886563797, .075952267855771], [.043330308831298, .077038849527912], [.041426630540984, .078079025877766], [.039497998397473, .079072170341994], [.037545574136653, .080017684687506], [.035570533825892, .080914999371817], [.033574067155622, .081763573886112], [.031557376722714, .082562897080836], [.029521677306074, .083312487473584], [.027468195134911, .084011893539132], [.025398167150101, .084660693981419], [.023312840259098, .08525849798732], [.021213470584847, .085804945462053], [.019101322709138, .086299707246093], [.016977668910873, .086742485313442], [.014843788399692, .087133012951149], [.012700966545425, .087471054919968], [.01055049410383, .087756407596056], [.008393666439096, .087988899093631], [.006231782743558, .08816838936851], [.004066145255116, .088294770302461], [.001898058472816, .088367965768336]], r.MDCT_TABLE_1920 = [[.032274858518097, 13202404176e-15], [.032274642494505, .000118821372483], [.032274080835421, .000224439068308], [.03227317354686, .000330054360572], [.032271920638538, .000435666118218], [.032270322123873, .000541273210231], [.032268378019984, .000646874505642], [.032266088347691, .000752468873546], [.032263453131514, .000858055183114], [.032260472399674, .0009636323036], [.032257146184092, .001069199104358], [.03225347452039, .001174754454853], [.032249457447888, .001280297224671], [.032245095009606, .001385826283535], [.032240387252262, .001491340501313], [.032235334226272, .001596838748031], [.03222993598575, .00170231989389], [.032224192588507, .001807782809271], [.03221810409605, .001913226364749], [.032211670573582, .002018649431111], [.03220489209, .002124050879359], [.032197768717898, .002229429580728], [.03219030053356, .002334784406698], [.032182487616965, .002440114229003], [.032174330051782, .002545417919644], [.032165827925374, .002650694350905], [.03215698132879, .002755942395358], [.032147790356771, .002861160925883], [.032138255107744, .002966348815672], [.032128375683825, .00307150493825], [.032118152190814, .003176628167476], [.032107584738196, .003281717377568], [.032096673439141, .003386771443102], [.0320854184105, .003491789239036], [.032073819772804, .003596769640711], [.032061877650267, .003701711523874], [.032049592170778, .00380661376468], [.032036963465906, .003911475239711], [.032023991670893, .004016294825985], [.032010676924657, .004121071400967], [.031997019369789, .004225803842586], [.031983019152549, .004330491029241], [.031968676422869, .004435131839816], [.031953991334348, .004539725153692], [.031938964044252, .004644269850758], [.03192359471351, .004748764811426], [.031907883506716, .004853208916638], [.031891830592124, .004957601047881], [.031875436141648, .0050619400872], [.031858700330859, .005166224917208], [.031841623338985, .005270454421097], [.031824205348907, .005374627482653], [.031806446547156, .005478742986267], [.031788347123916, .005582799816945], [.031769907273017, .005686796860323], [.031751127191935, .005790733002674], [.031732007081789, .005894607130928], [.03171254714734, .005998418132675], [.031692747596989, .006102164896182], [.031672608642773, .006205846310406], [.031652130500364, .006309461265002], [.031631313389067, .006413008650337], [.031610157531816, .006516487357501], [.031588663155172, .006619896278321], [.031566830489325, .00672323430537], [.031544659768083, .006826500331981], [.031522151228878, .006929693252258], [.031499305112758, .007032811961088], [.031476121664387, .007135855354151], [.03145260113204, .007238822327937], [.031428743767604, .007341711779751], [.031404549826572, .00744452260773], [.031380019568042, .007547253710853], [.031355153254712, .007649903988952], [.031329951152882, .007752472342725], [.031304413532445, .007854957673748], [.031278540666888, .007957358884484], [.03125233283329, .0080596748783], [.031225790312316, .008161904559473], [.031198913388214, .008264046833205], [.031171702348814, .008366100605636], [.031144157485525, .008468064783849], [.031116279093331, .008569938275893], [.031088067470786, .008671719990782], [.031059522920014, .008773408838517], [.031030645746705, .008875003730092], [.03100143626011, .008976503577507], [.030971894773039, .00907790729378], [.030942021601857, .009179213792959], [.030911817066483, .009280421990133], [.030881281490382, .009381530801444], [.030850415200566, .009482539144097], [.030819218527589, .009583445936373], [.030787691805541, .009684250097643], [.030755835372048, .009784950548375], [.030723649568268, .009885546210147], [.030691134738883, .009986036005661], [.030658291232103, .010086418858753], [.030625119399655, .010186693694402], [.030591619596781, .010286859438745], [.030557792182239, .010386915019088], [.030523637518292, .010486859363916], [.03048915597071, .010586691402906], [.030454347908763, .010686410066936], [.030419213705216, .010786014288099], [.030383753736329, .010885502999714], [.030347968381849, .010984875136338], [.03031185802501, .011084129633775], [.030275423052523, .011183265429088], [.030238663854579, .011282281460612], [.030201580824838, .011381176667967], [.03016417436043, .011479949992062], [.030126444861948, .011578600375117], [.030088392733446, .011677126760663], [.03005001838243, .011775528093563], [.030011322219859, .011873803320018], [.029972304660138, .011971951387578], [.029932966121114, .012069971245157], [.02989330702407, .012167861843041], [.029853327793724, .012265622132901], [.029813028858222, .012363251067801], [.029772410649132, .012460747602215], [.029731473601443, .012558110692033], [.029690218153558, .012655339294575], [.029648644747289, .0127524323686], [.029606753827855, .01284938887432], [.029564545843872, .012946207773407], [.029522021247356, .013042888029011], [.02947918049371, .013139428605762], [.029436024041725, .013235828469789], [.02939255235357, .013332086588727], [.029348765894794, .013428201931728], [.029304665134313, .013524173469475], [.029260250544412, .013620000174189], [.029215522600735, .013715681019643], [.029170481782283, .013811214981173], [.029125128571406, .013906601035686], [.029079463453801, .014001838161674], [.029033486918505, .014096925339225], [.028987199457889, .014191861550031], [.028940601567655, .014286645777401], [.028893693746829, .014381277006273], [.028846476497755, .014475754223221], [.028798950326094, .014570076416472], [.028751115740811, .01466424257591], [.028702973254178, .014758251693091], [.02865452338176, .014852102761253], [.028605766642418, .014945794775326], [.028556703558297, .015039326731945], [.028507334654823, .015132697629457], [.028457660460698, .015225906467935], [.028407681507891, .015318952249187], [.028357398331639, .015411833976768], [.028306811470432, .015504550655988], [.028255921466016, .015597101293927], [.028204728863381, .015689484899442], [.02815323421076, .015781700483179], [.028101438059619, .015873747057582], [.028049340964652, .015965623636907], [.027996943483779, .016057329237229], [.027944246178133, .016148862876456], [.027891249612061, .016240223574335], [.027837954353113, .016331410352467], [.027784360972039, .016422422234315], [.02773047004278, .016513258245214], [.027676282142466, .016603917412384], [.027621797851405, .016694398764938], [.02756701775308, .016784701333894], [.027511942434143, .016874824152183], [.027456572484404, .016964766254662], [.027400908496833, .017054526678124], [.027344951067546, .017144104461307], [.027288700795801, .017233498644904], [.027232158283994, .017322708271577], [.027175324137651, .01741173238596], [.027118198965418, .017500570034678], [.02706078337906, .017589220266351], [.027003077993454, .017677682131607], [.026945083426576, .017765954683088], [.026886800299502, .017854036975468], [.026828229236397, .017941928065456], [.026769370864511, .018029627011808], [.02671022581417, .01811713287534], [.026650794718768, .018204444718934], [.026591078214767, .018291561607551], [.02653107694168, .018378482608238], [.026470791542075, .018465206790142], [.026410222661558, .018551733224515], [.026349370948775, .01863806098473], [.026288237055398, .018724189146286], [.026226821636121, .018810116786819], [.026165125348656, .018895842986112], [.026103148853718, .018981366826109], [.026040892815028, .019066687390916], [.025978357899296, .019151803766819], [.025915544776223, .01923671504229], [.025852454118485, .019321420307998], [.025789086601733, .019405918656817], [.025725442904582, .019490209183837], [.025661523708606, .019574290986376], [.025597329698327, .019658163163984], [.025532861561211, .019741824818458], [.025468119987662, .019825275053848], [.025403105671008, .01990851297647], [.025337819307501, .019991537694913], [.025272261596305, .020074348320047], [.025206433239491, .020156943965039], [.025140334942028, .020239323745355], [.025073967411776, .020321486778774], [.025007331359476, .020403432185395], [.024940427498748, .02048515908765], [.024873256546079, .020566666610309], [.024805819220816, .020647953880491], [.024738116245157, .020729020027676], [.024670148344147, .020809864183709], [.024601916245669, .020890485482816], [.024533420680433, .020970883061607], [.024464662381971, .021051056059087], [.02439564208663, .02113100361667], [.024326360533561, .021210724878181], [.024256818464715, .021290218989868], [.02418701662483, .021369485100415], [.02411695576143, .021448522360944], [.024046636624808, .02152732992503], [.023976059968027, .021605906948708], [.023905226546906, .02168425259048], [.023834137120014, .021762366011328], [.023762792448662, .02184024637472], [.023691193296893, .02191789284662], [.023619340431478, .021995304595495], [.023547234621902, .02207248079233], [.023474876640361, .022149420610628], [.023402267261751, .022226123226426], [.023329407263659, .0223025878183], [.023256297426359, .022378813567377], [.023182938532797, .022454799657339], [.023109331368588, .022530545274437], [.023035476722006, .022606049607496], [.022961375383975, .022681311847926], [.022887028148061, .022756331189727], [.022812435810462, .022831106829504], [.022737599170003, .022905637966469], [.022662519028125, .022979923802453], [.022587196188874, .023053963541915], [.022511631458899, .02312775639195], [.022435825647437, .023201301562294], [.022359779566306, .023274598265338], [.0222834940299, .023347645716133], [.022206969855176, .0234204431324], [.022130207861645, .023492989734537], [.022053208871367, .023565284745628], [.02197597370894, .023637327391451], [.021898503201489, .023709116900488], [.021820798178663, .023780652503931], [.021742859472618, .023851933435691], [.021664687918017, .023922958932406], [.021586284352013, .023993728233451], [.021507649614247, .024064240580942], [.021428784546832, .02413449521975], [.02134968999435, .024204491397504], [.02127036680384, .0242742283646], [.021190815824791, .024343705374213], [.021111037909128, .024412921682298], [.02103103391121, .024481876547605], [.020950804687815, .024550569231683], [.020870351098134, .024618998998889], [.020789674003759, .024687165116394], [.020708774268678, .024755066854194], [.020627652759262, .024822703485116], [.020546310344257, .024890074284826], [.020464747894775, .024957178531837], [.020382966284284, .025024015507516], [.0203009663886, .025090584496093], [.020218749085876, .025156884784668], [.020136315256592, .025222915663218], [.020053665783549, .025288676424605], [.019970801551857, .025354166364584], [.019887723448925, .025419384781811], [.019804432364452, .025484330977848], [.019720929190419, .025549004257175], [.019637214821078, .025613403927192], [.019553290152943, .02567752929823], [.019469156084779, .025741379683559], [.019384813517595, .025804954399392], [.019300263354632, .025868252764895], [.019215506501354, .025931274102193], [.019130543865439, .025994017736379], [.019045376356769, .026056482995518], [.018960004887419, .026118669210657], [.018874430371648, .026180575715833], [.018788653725892, .026242201848076], [.01870267586875, .026303546947421], [.018616497720974, .026364610356909], [.018530120205464, .026425391422602], [.018443544247254, .026485889493583], [.018356770773502, .026546103921965], [.018269800713483, .026606034062902], [.018182634998576, .026665679274589], [.018095274562256, .026725038918274], [.018007720340083, .026784112358263], [.017919973269692, .026842898961926], [.017832034290785, .026901398099707], [.017743904345116, .026959609145127], [.017655584376488, .027017531474792], [.017567075330734, .027075164468401], [.017478378155718, .02713250750875], [.017389493801313, .027189559981742], [.017300423219401, .027246321276391], [.017211167363854, .027302790784828], [.017121727190533, .02735896790231], [.017032103657269, .027414852027226], [.016942297723858, .027470442561102], [.01685231035205, .027525738908608], [.016762142505537, .027580740477564], [.016671795149944, .027635446678948], [.016581269252819, .0276898569269], [.016490565783622, .02774397063873], [.016399685713714, .027797787234924], [.016308630016347, .027851306139149], [.016217399666655, .02790452677826], [.016125995641641, .027957448582309], [.01603441892017, .028010070984544], [.015942670482954, .028062393421421], [.015850751312545, .02811441533261], [.015758662393324, .028166136160998], [.015666404711489, .028217555352697], [.015573979255046, .028268672357047], [.015481387013797, .028319486626627], [.015388628979331, .028369997617257], [.015295706145012, .028420204788004], [.015202619505968, .028470107601191], [.015109370059084, .028519705522399], [.015015958802984, .028568998020472], [.01492238673803, .028617984567529], [.014828654866302, .028666664638963], [.014734764191593, .028715037713449], [.014640715719398, .028763103272951], [.0145465104569, .028810860802724], [.014452149412962, .028858309791325], [.014357633598114, .028905449730613], [.014262964024545, .028952280115756], [.01416814170609, .02899880044524], [.01407316765822, .029045010220868], [.01397804289803, .029090908947771], [.013882768444231, .029136496134411], [.013787345317136, .029181771292585], [.013691774538648, .029226733937433], [.013596057132255, .029271383587441], [.013500194123014, .029315719764447], [.013404186537539, .029359741993647], [.013308035403995, .029403449803598], [.013211741752084, .029446842726223], [.013115306613032, .02948992029682], [.013018731019584, .029532682054063], [.012922016005985, .029575127540008], [.012825162607977, .029617256300097], [.012728171862781, .029659067883165], [.012631044809089, .029700561841444], [.012533782487056, .029741737730567], [.012436385938281, .029782595109573], [.012338856205805, .029823133540913], [.012241194334091, .029863352590452], [.012143401369021, .029903251827477], [.012045478357878, .029942830824699], [.011947426349339, .029982089158259], [.011849246393462, .030021026407731], [.011750939541676, .030059642156129], [.011652506846768, .030097935989909], [.011553949362874, .030135907498976], [.011455268145464, .030173556276684], [.011356464251335, .030210881919845], [.011257538738598, .030247884028732], [.011158492666665, .030284562207083], [.01105932709624, .030320916062102], [.010960043089307, .03035694520447], [.010860641709118, .030392649248343], [.010761124020182, .030428027811361], [.010661491088253, .030463080514646], [.010561743980319, .030497806982812], [.010461883764593, .030532206843968], [.010361911510496, .030566279729717], [.010261828288652, .030600025275167], [.010161635170872, .030633443118931], [.010061333230142, .030666532903129], [.009960923540617, .030699294273397], [.009860407177603, .030731726878888], [.00975978521755, .030763830372273], [.009659058738038, .03079560440975], [.009558228817767, .030827048651045], [.009457296536545, .030858162759415], [.009356262975275, .030888946401653], [.009255129215945, .030919399248091], [.009153896341616, .030949520972603], [.009052565436412, .030979311252611], [.008951137585505, .031008769769084], [.008849613875105, .031037896206544], [.008747995392451, .031066690253072], [.008646283225794, .031095151600306], [.00854447846439, .031123279943448], [.008442582198486, .031151074981266], [.00834059551931, .031178536416098], [.008238519519057, .031205663953853], [.008136355290878, .031232457304017], [.008034103928871, .031258916179656], [.007931766528065, .031285040297416], [.007829344184412, .031310829377528], [.007726837994772, .031336283143813], [.007624249056906, .03136140132368], [.007521578469457, .031386183648135], [.007418827331946, .031410629851778], [.007315996744755, .031434739672811], [.007213087809115, .031458512853036], [.007110101627101, .031481949137863], [.00700703930161, .031505048276306], [.006903901936357, .031527810020993], [.006800690635862, .031550234128164], [.006697406505433, .031572320357675], [.006594050651161, .031594068473], [.006490624179905, .031615478241233], [.006387128199278, .031636549433095], [.006283563817639, .031657281822929], [.00617993214408, .031677675188707], [.006076234288412, .031697729312034], [.005972471361157, .031717443978146], [.005868644473532, .031736818975914], [.00576475473744, .031755854097848], [.005660803265456, .031774549140098], [.005556791170816, .031792903902453], [.005452719567407, .03181091818835], [.005348589569753, .031828591804869], [.005244402293001, .031845924562742], [.005140158852914, .031862916276347], [.005035860365855, .031879566763717], [.004931507948778, .031895875846539], [.004827102719212, .031911843350155], [.004722645795254, .031927469103567], [.004618138295554, .031942752939435], [.004513581339303, .031957694694082], [.004408976046222, .031972294207493], [.004304323536549, .03198655132332], [.00419962493103, .032000465888879], [.004094881350902, .032014037755158], [.003990093917884, .032027266776813], [.003885263754166, .03204015281217], [.003780391982394, .032052695723232], [.003675479725661, .032064895375674], [.003570528107494, .032076751638847], [.003465538251839, .03208826438578], [.003360511283053, .032099433493181], [.003255448325892, .032110258841438], [.003150350505494, .032120740314619], [.003045218947373, .032130877800478], [.002940054777404, .032140671190449], [.00283485912181, .032150120379653], [.002729633107153, .032159225266897], [.002624377860318, .032167985754674], [.002519094508504, .032176401749168], [.002413784179212, .03218447316025], [.002308448000231, .032192199901481], [.002203087099626, .032199581890114], [.002097702605728, .032206619047093], [.001992295647121, .032213311297057], [.001886867352628, .032219658568338], [.001781418851302, .03222566079296], [.00167595127241, .032231317906644], [.001570465745428, .032236629848809], [.001464963400018, .032241596562566], [.001359445366028, .032246217994727], [.00125391277347, .032250494095799], [.001148366752513, .03225442481999], [.001042808433471, .032258010125204], [.000937238946789, .032261249973045], [.00083165942303, .032264144328817], [.000726070992868, .032266693161525], [.000620474787068, .032268896443871], [.000514871936481, .032270754152261], [.00040926357203, .032272266266801], [.000303650824695, .032273432771295], [.000198034825504, .032274253653254], [92416705518e-15, .032274728903884]], r.MDCT_TABLE_240 = [[.091286604111815, .000298735779793], [.091247502481454, .002688238127538], [.091145864370807, .005075898091152], [.090981759437558, .00746007928776], [.09075530015103, .009839147718664], [.090466641715108, .012211472889198], [.090115981961863, .014575428926191], [.089703561215976, .016929395692256], [.089229662130024, .019271759896156], [.088694609490769, .02160091619847], [.088098769996564, .02391526831181], [.087442552006035, .026213230094844], [.086726405258214, .028493226639351], [.085950820564309, .030753695349588], [.085116329471329, .032993087013213], [.084223503897785, .035209866863042], [.083272955741727, .037402515628894], [.082265336461381, .039569530578832], [.08120133662867, .041709426549053], [.08008168545593, .043820736961749], [.078907150296148, .045902014830227], [.077678536117054, .047951833750597], [.076396684949434, .049968788879362], [.07506247531005, .051951497896226], [.073676821599542, .053898601951466], [.072240673475749, .055808766597225], [.070755015202858, .057680682702068], [.06922086497684, .059513067348201], [.067639274227625, .061304664710718], [.066011326898512, .063054246918278], [.064338138703282, .06476061489463], [.062620856361546, .066422599180399], [.060860656812842, .068039060734572], [.059058746410016, .069608891715145], [.05721636009245, .071131016238378], [.055334760539699, .072604391116154], [.053415237306106, .07402800657093], [.051459105937014, .075400886927784], [.049467707067153, .076722091283096], [.047442405501835, .077990714149396], [.045384589281588, .079205886075941], [.043295668730857, .080366774244592], [.041177075491445, .081472583040586], [.039030261541332, .08252255459781], [.036856698199564, .083515969318206], [.034657875117883, .084452146364948], [.032435299259796, .085330444129049], [.030190493867775, .086150260669096], [.027924997419306, .086911034123781], [.025640362572491, .087612243096981], [.023338155101933, .088253407015092], [.021019952825636, .08883408645639], [.018687344523641, .089353883452193], [.016341928849164, .089812441759604], [.013985313232951, .090209447105664], [.011619112781631, .09054462740274], [.009244949170797, .090817752935], [.006864449533597, .091028636515846], [.004479245345574, .091177133616206], [.002090971306534, .091263142463585]]
    }, {}],
    11: [function (t, e, r) {
        const i = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 64, 72, 80, 88, 96, 108, 120, 132, 144, 156, 172, 188, 212, 240, 276, 320, 384, 448, 512, 576, 640, 704, 768, 832, 896, 960, 1024]), n = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 32, 40, 48, 64, 92, 128]), s = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 64, 72, 80, 88, 100, 112, 124, 140, 156, 172, 192, 216, 240, 268, 304, 344, 384, 424, 464, 504, 544, 584, 624, 664, 704, 744, 784, 824, 864, 904, 944, 984, 1024]), o = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 32, 40, 48, 64, 92, 128]), a = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 48, 56, 64, 72, 80, 88, 96, 108, 120, 132, 144, 160, 176, 196, 216, 240, 264, 292, 320, 352, 384, 416, 448, 480, 512, 544, 576, 608, 640, 672, 704, 736, 768, 800, 832, 864, 896, 928, 1024]), h = new Uint16Array([0, 4, 8, 12, 16, 20, 28, 36, 44, 56, 68, 80, 96, 112, 128]), f = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 48, 56, 64, 72, 80, 88, 96, 108, 120, 132, 144, 160, 176, 196, 216, 240, 264, 292, 320, 352, 384, 416, 448, 480, 512, 544, 576, 608, 640, 672, 704, 736, 768, 800, 832, 864, 896, 928, 960, 992, 1024]), c = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 52, 60, 68, 76, 84, 92, 100, 108, 116, 124, 136, 148, 160, 172, 188, 204, 220, 240, 260, 284, 308, 336, 364, 396, 432, 468, 508, 552, 600, 652, 704, 768, 832, 896, 960, 1024]), u = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 28, 36, 44, 52, 64, 76, 92, 108, 128]), l = new Uint16Array([0, 8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88, 100, 112, 124, 136, 148, 160, 172, 184, 196, 212, 228, 244, 260, 280, 300, 320, 344, 368, 396, 424, 456, 492, 532, 572, 616, 664, 716, 772, 832, 896, 960, 1024]), d = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 28, 32, 40, 48, 60, 72, 88, 108, 128]), p = new Uint16Array([0, 12, 24, 36, 48, 60, 72, 84, 96, 108, 120, 132, 144, 156, 172, 188, 204, 220, 236, 252, 268, 288, 308, 328, 348, 372, 396, 420, 448, 476, 508, 544, 580, 620, 664, 712, 764, 820, 880, 944, 1024]), w = new Uint16Array([0, 4, 8, 12, 16, 20, 24, 28, 36, 44, 52, 60, 72, 88, 108, 128]);
        r.SWB_OFFSET_1024 = [i, i, s, a, a, f, c, c, l, l, l, p], r.SWB_OFFSET_128 = [n, n, o, h, h, h, u, u, d, d, d, w], r.SWB_SHORT_WINDOW_COUNT = new Uint8Array([12, 12, 12, 14, 14, 14, 15, 15, 15, 15, 15, 15]), r.SWB_LONG_WINDOW_COUNT = new Uint8Array([41, 41, 47, 49, 49, 51, 47, 47, 43, 43, 43, 40]), r.SCALEFACTOR_TABLE = function () {
            for (var t = new Float32Array(428), e = 0; e < 428; e++)t[e] = Math.pow(2, (e - 200) / 4);
            return t
        }(), r.IQ_TABLE = function () {
            for (var t = new Float32Array(8191), e = 0; e < 8191; e++)t[e] = Math.pow(e, 4 / 3);
            return t
        }(), r.SAMPLE_RATES = new Int32Array([96e3, 88200, 64e3, 48e3, 44100, 32e3, 24e3, 22050, 16e3, 12e3, 11025, 8e3, 7350])
    }, {}],
    12: [function (t, e, r) {
        function i(t) {
            this.maxBands = h[t.sampleIndex], this.nFilt = new Int32Array(8), this.length = new Array(8), this.direction = new Array(8), this.order = new Array(8), this.coef = new Array(8);
            for (var e = 0; e < 8; e++) {
                this.length[e] = new Int32Array(4), this.direction[e] = new Array(4), this.order[e] = new Int32Array(4), this.coef[e] = new Array(4);
                for (var r = 0; r < 4; r++)this.coef[e][r] = new Float32Array(n)
            }
            this.lpc = new Float32Array(n), this.tmp = new Float32Array(n)
        }

        const n = 20, s = [1, 4, 3], o = [2, 6, 5], a = [[0, -.43388373, -.7818315, -.9749279, .98480773, .86602539, .64278758, .34202015], [0, -.2079117, -.40673664, -.58778524, -.74314481, -.86602539, -.95105654, -.99452192, .99573416, .96182561, .8951633, .7980172, .67369562, .52643216, .36124167, .18374951], [0, -.43388373, .64278758, .34202015], [0, -.2079117, -.40673664, -.58778524, .67369562, .52643216, .36124167, .18374951]], h = [31, 31, 34, 40, 42, 51, 46, 46, 42, 42, 42, 39, 39];
        i.prototype.decode = function (t, e) {
            for (var r = e.windowCount, i = 2 === e.windowSequence ? s : o, n = 0; n < r; n++)if (this.nFilt[n] = t.read(i[0]))for (var h = t.read(1), f = this.nFilt[n], c = this.length[n], u = this.order[n], l = this.direction[n], d = this.coef[n], p = 0; p < f; p++) {
                if (c[p] = t.read(i[1]), (u[p] = t.read(i[2])) > 20)throw new Error("TNS filter out of range: " + u[p]);
                if (u[p]) {
                    l[p] = !!t.read(1);
                    for (var w = t.read(1), m = h + 3 - w, v = a[2 * w + h], y = u[p], g = d[p], b = 0; b < y; b++)g[b] = v[t.read(m)]
                }
            }
        }, i.prototype.process = function (t, e, r) {
            for (var i = Math.min(this.maxBands, t.maxSFB), n = this.lpc, s = this.tmp, o = t.info, a = o.windowCount, h = 0; h < a; h++)for (var f = o.swbCount, c = this.nFilt[h], u = this.length[h], l = this.order[h], d = this.coef[h], p = this.direction[h], w = 0; w < c; w++) {
                var m = f, f = Math.max(0, s - u[w]), v = l[w];
                if (0 !== v) {
                    for (var y = d[w], g = 0; g < v; g++) {
                        var b = -y[g];
                        n[g] = b;
                        for (var I = 0, k = g + 1 >> 1; I < k; I++) {
                            var E = n[I], A = n[g - 1 - I];
                            n[I] = E + b * A, n[g - 1 - I] = A + b * E
                        }
                    }
                    var S, _ = o.swbOffsets[Math.min(f, i)], T = o.swbOffsets[Math.min(m, i)], B = 1;
                    if (!((S = T - _) <= 0))if (p[w] && (B = -1, _ = T - 1), _ += 128 * h, r)for (C = 0; C < S; C++, _ += B)for (g = 1; g <= Math.min(C, v); g++)e[_] -= e[_ - g * B] * n[g - 1]; else for (var C = 0; C < S; C++, _ += B) {
                        s[0] = e[_];
                        for (g = 1; g <= Math.min(C, v); g++)e[_] += s[g] * n[g - 1];
                        for (g = v; g > 0; g--)s[g] = s[g - 1]
                    }
                }
            }
        }, e.exports = i
    }, {}]
}, {}, [4]), WebAudioDecoder = function (t) {
    "use strict";
    function e() {
        this.audioFormat = {
            formatID: "aac ",
            sampleRate: 44100,
            channelsPerFrame: 2,
            bitsPerChannel: 16
        }, this.isGetFormat = !1, this.audioCookie = null, this.flacDecoder = null, this.filterBank = null, this.audioType = r
    }

    __extends(e, t);
    var r = 0;
    return e.prototype.createFLACDecoderIfNeed = function () {
        this.flacDecoder || this.isGetFormat && this.audioCookie && (this.flacDecoder = new FLACDecoder(this.audioFormat, this.audioCookie), this.flacDecoder.on("data", function (t) {
            return function (e) {
                return t.onDecodedData(e), !1
            }
        }(this)), this.flacDecoder.on("error", function (t) {
            return function (e) {
                return t.flacDecoder = null, !1
            }
        }(this)))
    }, e.prototype.getAudioCacheMinLength = function () {
        return 1 == this.audioType ? 6 : 2 == this.audioType ? 1 : 0
    }, e.prototype.getAudioType = function (t) {
        var e = new Uint8Array(t);
        if (e.length <= 3)return 0;
        var r = e[0], i = e[1], n = e[2];
        return 3 != r || 204 != i ? 0 : n
    }, e.prototype.recieveData = function (t) {
        var e = this.getAudioType(t);
        r == this.audioType && (this.audioType = e), 1 == this.audioType ? this.recieveDataForAAC(new AVBuffer(t.slice(3))) : 2 == this.audioType && this.recieveDataForFLAC(new AVBuffer(t.slice(3)))
    }, e.prototype.onDecodedData = function (t) {
        if (this.audioFormat.floatingPoint)this.emit("decodedData", t); else {
            for (var e = new Float32Array(t.length), r = Math.pow(2, this.audioFormat.bitsPerChannel - 1), i = 0; i < t.length; ++i) {
                var n = t[i];
                e[i] = n / r
            }
            this.emit("decodedData", e)
        }
    }, e.prototype.recieveDataForAAC = function (t) {
        var e = new classADTSDemuxer(t);
        e.on("format", function (t) {
            return function (e) {
                t.audioFormat = e, t.isGetFormat = !0, t.filterBank || (t.filterBank = new classFilterBank(!1, t.audioFormat.channelsPerFrame))
            }
        }(this)), e.on("cookie", function (t) {
            return function (e) {
                t.audioCookie = e
            }
        }(this)), e.on("data", function (t) {
            return function (e) {
                var r = new classAACDecoder(t.audioFormat, [t.audioCookie, t.filterBank]);
                return r.on("data", function (t) {
                    return function (e) {
                        return t.onDecodedData(e), !1
                    }
                }(t)), r.recieveData(e), r.decode(), !1
            }
        }(this)), e.readChunk()
    }, e.prototype.recieveDataForFLAC = function (t) {
        var e = new FLACDemuxer(t);
        e.on("notFLAC", function (e) {
            return function (r) {
                return e.createFLACDecoderIfNeed(), e.flacDecoder && (e.flacDecoder.recieveData(t), e.flacDecoder.decode() && (e.flacDecoder = null)), !1
            }
        }(this)), e.on("format", function (t) {
            return function (e) {
                t.audioFormat = e, t.isGetFormat = !0
            }
        }(this)), e.on("cookie", function (t) {
            return function (e) {
                t.audioCookie = e
            }
        }(this)), e.on("data", function (t) {
            return function (e) {
                return t.createFLACDecoderIfNeed(), t.flacDecoder && (t.flacDecoder.recieveData(e), t.flacDecoder.decode() && (t.flacDecoder = null)), !1
            }
        }(this)), e.readChunk()
    }, e
}(EventEmitter);
var webAudioDecoder = null, webWorkerInit = !1;
onmessage = function (t) {
    webWorkerInit || (webWorkerInit = !0, (webAudioDecoder = new WebAudioDecoder).on("decodedData", function (t) {
        return function (e) {
            postMessage([t.audioType, t.audioFormat, e.buffer], [e.buffer])
        }
    }(webAudioDecoder))), webAudioDecoder.recieveData(t.data)
};
;
///<jscompress sourcefile="QMCGAudioDevice.js" />
WebAudioDevice = function (e) {
    "use strict";
    function o(e) {
        this.messageSender = e, this.audioContext = this.getAudioContext(), this.myWorker = null, this.audioDataDecodedCache = [], this.webAudioDecoder = new WebAudioDecoder, this.webAudioDecoder.on("decodedData", function (e) {
            return function (o) {
                0 == e.audioBufferResampleSize && (e.audioBufferResampleSize = Math.ceil(e.audioBufferSize / (e.audioContext.sampleRate / e.webAudioDecoder.audioFormat.sampleRate) * e.webAudioDecoder.audioFormat.channelsPerFrame), e.audioBufferResampleSize += e.audioBufferResampleSize % e.webAudioDecoder.audioFormat.channelsPerFrame), e.resampler || e.webAudioDecoder.audioFormat.sampleRate == e.audioContext.sampleRate || (e.resampler = new Resampler(e.webAudioDecoder.audioFormat.sampleRate, e.audioContext.sampleRate, e.webAudioDecoder.audioFormat.channelsPerFrame, e.audioBufferResampleSize)), e.doAudio(o)
            }
        }(this)), this.resetInitData()
    }

    return __extends(o, e), o.prototype.resetInitData = function () {
        this.audioScriptProcessorNode = null, this.audioBufferSize = 4096, this.resampler = null, this.audioBufferResampleSize = 0, this.audioDataDecodedOneCache = null, this.audioDataDecodedOneCacheOffset = 0
    }, o.prototype.getAudioContext = function () {
        return "undefined" != typeof AudioContext ? new AudioContext : "undefined" != typeof webkitAudioContext ? new webkitAudioContext : "undefined" != typeof mozAudioContext ? new mozAudioContext : "undefined" != typeof msAudioContext ? new msAudioContext : null
    }, o.prototype.onAudioProcessDataForSelfDecodedData = function (e) {
        if (this.audioDataDecodedCache.length < 0)console.log("no more cache data 1"); else {
            for (var o = e.outputBuffer, t = o.numberOfChannels, i = new Array(t), a = 0, d = 0; d < t; ++d)i[d] = o.getChannelData(d), a = i[d].length;
            var r = new Float32Array(this.audioBufferResampleSize);
            this.fillAudioData(r), this.resampler && (r = this.resampler.resampler(r));
            for (var d = 0, s = 0; d < a; ++d)for (var u = 0; u < t; ++u)i[u][d] = r[s], ++s
        }
    }, o.prototype.fillAudioData = function (e) {
        this.audioDataDecodedOneCache || (this.audioDataDecodedOneCache = this.audioDataDecodedCache.shift(), this.audioDataDecodedOneCacheOffset = 0);
        for (var o = 0; this.audioDataDecodedOneCache && o < e.length;) {
            for (var t = Math.min(this.audioDataDecodedOneCache.length - this.audioDataDecodedOneCacheOffset, e.length - o), i = 0; i < t; ++i)e[o++] = this.audioDataDecodedOneCache[this.audioDataDecodedOneCacheOffset++];
            this.audioDataDecodedOneCacheOffset === this.audioDataDecodedOneCache.length && (this.audioDataDecodedOneCache = this.audioDataDecodedCache.shift(), this.audioDataDecodedOneCacheOffset = 0)
        }
    }, o.prototype.doDecodeAudioDataOnThread = function (e) {
        return "undefined" != typeof Worker && (this.myWorker || (console.log("web worker support"), this.myWorker = new Worker("./QMCGAudioDecoder.js"), this.myWorker.onmessage = function (e) {
                this.webAudioDecoder.audioType = e.data[0], this.webAudioDecoder.isGetFormat = !0, this.webAudioDecoder.audioFormat = e.data[1], this.webAudioDecoder.emit("decodedData", new Float32Array(e.data[2]))
            }.bind(this)), !!this.myWorker && (this.myWorker.postMessage(e, [e]), !0))
    }, o.prototype.doAudio = function (e) {
        this.audioDataDecodedCache.length > this.webAudioDecoder.getAudioCacheMinLength() && this.audioDataDecodedCache.shift(), this.audioDataDecodedCache.push(e), this.createAudioIfNeed()
    }, o.prototype.isSupport = function () {
        return null != this.audioContext
    }, o.prototype.createAudioIfNeed = function () {
        this.audioScriptProcessorNode || this.reCreate()
    }, o.prototype.canReCreate = function () {
        return this.webAudioDecoder.isGetFormat
    }, o.prototype.reCreate = function () {
        this.audioScriptProcessorNode && (this.audioScriptProcessorNode.disconnect(), this.audioScriptProcessorNode = null), this.resetInitData(), this.audioContext = this.getAudioContext(), this.audioContext && (this.audioScriptProcessorNode = this.audioContext.createScriptProcessor(this.audioBufferSize, this.webAudioDecoder.audioFormat.channelsPerFrame, this.webAudioDecoder.audioFormat.channelsPerFrame), this.audioScriptProcessorNode.onaudioprocess = this.onAudioProcessDataForSelfDecodedData.bind(this), this.audioScriptProcessorNode.connect(this.audioContext.destination))
    }, o.prototype.recieveData = function (e) {
        this.isSupport() && (this.doDecodeAudioDataOnThread(e) || this.webAudioDecoder.recieveData(e))
    }, o
}(EventEmitter);
;
///<jscompress sourcefile="wasm_exec.js" />
(() = > {if("undefined" != typeof global
)
;else
if ("undefined" != typeof window)window.global = window; else {
    if ("undefined" == typeof self)throw new Error("cannot export Go (neither global, window nor self is defined)");
    self.global = self
}
if (global.require || "undefined" == typeof require || (global.require = require), !global.fs && global.require && (global.fs = require("fs")), !global.fs) {
    let e = "";
    global.fs = {
        constants: {O_WRONLY: -1, O_RDWR: -1, O_CREAT: -1, O_TRUNC: -1, O_APPEND: -1, O_EXCL: -1},
        writeSync(s, n){
            const i = (e += t.decode(n)).lastIndexOf("\n");
            return -1 != i && (console.log(e.substr(0, i)), e = e.substr(i + 1)), n.length
        },
        write(e, t, s, n, i, r){
            if (0 !== s || n !== t.length || null !== i)throw new Error("not implemented");
            r(null, this.writeSync(e, t))
        },
        open(e, t, s, n){
            const i = new Error("not implemented");
            i.code = "ENOSYS", n(i)
        },
        read(e, t, s, n, i, r){
            const o = new Error("not implemented");
            o.code = "ENOSYS", r(o)
        },
        fsync(e, t){
            t(null)
        }
    }
}
if (!global.crypto) {
    const e = require("crypto");
    global.crypto = {
        getRandomValues(t){
            e.randomFillSync(t)
        }
    }
}
global.performance || (global.performance = {
    now(){
        const [e,t]=process.hrtime();
        return 1e3 * e + t / 1e6
    }
}), global.TextEncoder || (global.TextEncoder = require("util").TextEncoder), global.TextDecoder || (global.TextDecoder = require("util").TextDecoder);
const e = new TextEncoder("utf-8"), t = new TextDecoder("utf-8");
if (global.Go = class {
        constructor() {
            this.argv = ["js"], this.env = {}, this.exit = (e = > {0 !== e && console.warn("exit code:", e)
        }),
            this._exitPromise = new Promise(e = > {this._resolveExitPromise = e
        }),
            this._pendingEvent = null, this._scheduledTimeouts = new Map, this._nextCallbackTimeoutID = 1;
            const s = () =
        >
            new DataView(this._inst.exports.mem.buffer), n = (e, t) =
        >
            {
                s().setUint32(e + 0, t, !0), s().setUint32(e + 4, Math.floor(t / 4294967296), !0)
            }
        ,
            i = e =
        >
            {
                return s().getUint32(e + 0, !0) + 4294967296 * s().getInt32(e + 4, !0)
            }
        ,
            r = e =
        >
            {
                const t = s().getFloat64(e, !0);
                if (0 === t)return;
                if (!isNaN(t))return t;
                const n = s().getUint32(e, !0);
                return this._values[n]
            }
        ,
            o = (e, t) =
        >
            {
                if ("number" == typeof t)return isNaN(t) ? (s().setUint32(e + 4, 2146959360, !0), void s().setUint32(e, 0, !0)) : 0 === t ? (s().setUint32(e + 4, 2146959360, !0), void s().setUint32(e, 1, !0)) : void s().setFloat64(e, t, !0);
                switch (t) {
                    case void 0:
                        return void s().setFloat64(e, 0, !0);
                    case null:
                        return s().setUint32(e + 4, 2146959360, !0), void s().setUint32(e, 2, !0);
                    case!0:
                        return s().setUint32(e + 4, 2146959360, !0), void s().setUint32(e, 3, !0);
                    case!1:
                        return s().setUint32(e + 4, 2146959360, !0), void s().setUint32(e, 4, !0)
                }
                let n = this._refs.get(t);
                void 0 === n && (n = this._values.length, this._values.push(t), this._refs.set(t, n));
                let i = 0;
                switch (typeof t) {
                    case"string":
                        i = 1;
                        break;
                    case"symbol":
                        i = 2;
                        break;
                    case"function":
                        i = 3
                }
                s().setUint32(e + 4, 2146959360 | i, !0), s().setUint32(e, n, !0)
            }
        ,
            l = e =
        >
            {
                const t = i(e + 0), s = i(e + 8);
                return new Uint8Array(this._inst.exports.mem.buffer, t, s)
            }
        ,
            a = e =
        >
            {
                const t = i(e + 0), s = i(e + 8), n = new Array(s);
                for (let e = 0; e < s; e++)n[e] = r(t + 8 * e);
                return n
            }
        ,
            c = e =
        >
            {
                const s = i(e + 0), n = i(e + 8);
                return t.decode(new DataView(this._inst.exports.mem.buffer, s, n))
            }
        ,
            u = Date.now() - performance.now();
            this.importObject = {go: {"runtime.wasmExit": e = > {const t = s().getInt32(e + 8, !0);
            this.exited = !0, delete this._inst, delete this._values, delete this._refs, this.exit(t)
        },
            "runtime.wasmWrite"
        :
            e =
        >
            {
                const t = i(e + 8), n = i(e + 16), r = s().getInt32(e + 24, !0);
                fs.writeSync(t, new Uint8Array(this._inst.exports.mem.buffer, n, r))
            }
        ,
            "runtime.nanotime"
        :
            e =
        >
            {
                n(e + 8, 1e6 * (u + performance.now()))
            }
        ,
            "runtime.walltime"
        :
            e =
        >
            {
                const t = (new Date).getTime();
                n(e + 8, t / 1e3), s().setInt32(e + 16, t % 1e3 * 1e6, !0)
            }
        ,
            "runtime.scheduleTimeoutEvent"
        :
            e =
        >
            {
                const t = this._nextCallbackTimeoutID;
                this._nextCallbackTimeoutID++, this._scheduledTimeouts.set(t, setTimeout(() = > {for(this._resume();
                this._scheduledTimeouts.has(t);
            )
                console.warn("scheduleTimeoutEvent: missed timeout event"), this._resume()
            },
                i(e + 8) + 1
            )),
                s().setInt32(e + 16, t, !0)
            }
        ,
            "runtime.clearTimeoutEvent"
        :
            e =
        >
            {
                const t = s().getInt32(e + 8, !0);
                clearTimeout(this._scheduledTimeouts.get(t)), this._scheduledTimeouts.delete(t)
            }
        ,
            "runtime.getRandomData"
        :
            e =
        >
            {
                crypto.getRandomValues(l(e + 8))
            }
        ,
            "syscall/js.stringVal"
        :
            e =
        >
            {
                o(e + 24, c(e + 8))
            }
        ,
            "syscall/js.valueGet"
        :
            e =
        >
            {
                const t = Reflect.get(r(e + 8), c(e + 16));
                e = this._inst.exports.getsp(), o(e + 32, t)
            }
        ,
            "syscall/js.valueSet"
        :
            e =
        >
            {
                Reflect.set(r(e + 8), c(e + 16), r(e + 32))
            }
        ,
            "syscall/js.valueIndex"
        :
            e =
        >
            {
                o(e + 24, Reflect.get(r(e + 8), i(e + 16)))
            }
        ,
            "syscall/js.valueSetIndex"
        :
            e =
        >
            {
                Reflect.set(r(e + 8), i(e + 16), r(e + 24))
            }
        ,
            "syscall/js.valueCall"
        :
            e =
        >
            {
                try {
                    const t = r(e + 8), n = Reflect.get(t, c(e + 16)), i = a(e + 32), l = Reflect.apply(n, t, i);
                    e = this._inst.exports.getsp(), o(e + 56, l), s().setUint8(e + 64, 1)
                } catch (t) {
                    o(e + 56, t), s().setUint8(e + 64, 0)
                }
            }
        ,
            "syscall/js.valueInvoke"
        :
            e =
        >
            {
                try {
                    const t = r(e + 8), n = a(e + 16), i = Reflect.apply(t, void 0, n);
                    e = this._inst.exports.getsp(), o(e + 40, i), s().setUint8(e + 48, 1)
                } catch (t) {
                    o(e + 40, t), s().setUint8(e + 48, 0)
                }
            }
        ,
            "syscall/js.valueNew"
        :
            e =
        >
            {
                try {
                    const t = r(e + 8), n = a(e + 16), i = Reflect.construct(t, n);
                    e = this._inst.exports.getsp(), o(e + 40, i), s().setUint8(e + 48, 1)
                } catch (t) {
                    o(e + 40, t), s().setUint8(e + 48, 0)
                }
            }
        ,
            "syscall/js.valueLength"
        :
            e =
        >
            {
                n(e + 16, parseInt(r(e + 8).length))
            }
        ,
            "syscall/js.valuePrepareString"
        :
            t =
        >
            {
                const s = e.encode(String(r(t + 8)));
                o(t + 16, s), n(t + 24, s.length)
            }
        ,
            "syscall/js.valueLoadString"
        :
            e =
        >
            {
                const t = r(e + 8);
                l(e + 16).set(t)
            }
        ,
            "syscall/js.valueInstanceOf"
        :
            e =
        >
            {
                s().setUint8(e + 24, r(e + 8) instanceof r(e + 16))
            }
        ,
            "syscall/js.copyBytesToGo"
        :
            e =
        >
            {
                const t = l(e + 8), i = r(e + 32);
                if (!(i instanceof Uint8Array))return void s().setUint8(e + 48, 0);
                const o = i.subarray(0, t.length);
                t.set(o), n(e + 40, o.length), s().setUint8(e + 48, 1)
            }
        ,
            "syscall/js.copyBytesToJS"
        :
            e =
        >
            {
                const t = r(e + 8), i = l(e + 16);
                if (!(t instanceof Uint8Array))return void s().setUint8(e + 48, 0);
                const o = i.subarray(0, t.length);
                t.set(o), n(e + 40, o.length), s().setUint8(e + 48, 1)
            }
        ,
            debug:e =
        >
            {
                console.log(e)
            }
        }
        }
        }

        async

        run(t) {
            this._inst = t, this._values = [NaN, 0, null, !0, !1, global, this], this._refs = new Map, this.exited = !1;
            const s = new DataView(this._inst.exports.mem.buffer);
            let n = 4096;
            const i = t =
        >
            {
                const i = n, r = e.encode(t + "\0");
                return new Uint8Array(s.buffer, n, r.length).set(r), (n += r.length) % 8 != 0 && (n += 8 - n % 8), i
            }
        ,
            r = this.argv.length, o = [];
            this.argv.forEach(e = > {o.push(i(e))
        })
            ;
            const l = Object.keys(this.env).sort();
            o.push(l.length), l.forEach(e = > {o.push(i(`${e}=${this.env[e]}`))
        })
            ;
            const a = n;
            o.forEach(e = > {s.setUint32(n, e, !0), s.setUint32(n + 4, 0, !0), n += 8
        }),
            this._inst.exports.run(r, a), this.exited && this._resolveExitPromise(), await
            this._exitPromise
        }

        _resume() {
            if (this.exited)throw new Error("Go program has already exited");
            this._inst.exports.resume(), this.exited && this._resolveExitPromise()
        }

        _makeFuncWrapper(e) {
            const t = this;
            return function () {
                const s = {id: e, this: this, args: arguments};
                return t._pendingEvent = s, t._resume(), s.result
            }
        }
    }, global.require && global.require.main === module && global.process && global.process.versions && !global.process.versions.electron) {
    process.argv.length < 3 && (console.error("usage: go_js_wasm_exec [wasm binary] [arguments]"), process.exit(1));
    const e = new Go;
    e.argv = process.argv.slice(2), e.env = Object.assign({TMPDIR: require("os").tmpdir()}, process.env), e.exit = process.exit, WebAssembly.instantiate(fs.readFileSync(process.argv[2]), e.importObject).then(t = > (process.on("exit", t = > {0 !== t || e.exited || (e._pendingEvent = {id: 0}, e._resume())
}),
    e.run(t.instance)
)).
    catch(e = > {console.error(e), process.exit(1)
})
}
})
();
;
///<jscompress sourcefile="strings.js" />
window.onlineStepsMsgs = {
    CHECK_PARAMS: "检查登录参数...",
    VERIFY_OP_TOKEN: "验证登录Token...",
    VERIFY_ONLINE_ON_GSM: "通过管理服务器验证...",
    FETCH_GAME_INFO: "获取游戏信息...",
    HANDLE_PERSONAL_STORAGE: "处理存档中...",
    INIT_IO: "初始化IO",
    STARTING_GAME: "启动游戏中...",
    GAME_STARTED_HAS_VIDEO: "游戏启动完毕...",
    PREPARE_GAME_ENV: "准备游戏环境..."
}, window.clientOnlineFailMsgs = {
    NO_ERR: "成功",
    FAILED: "未知原因。",
    VER_NOT_SUPPORT: "客户端版本过低。",
    ONLINE_INFO: "登录信息有误。",
    NO_SEAT_LEFT: "服务器已满。",
    GSM_REFUSE: "管理服务器拒绝登录。",
    PERSONAL_STORE_FILE: "存档数据处理失败。",
    GAME_FAIL: "游戏启动失败。",
    GAME_MODE_NOT_SUPPORTED: "不支持的单人/多人游戏模式。",
    ENCODE_INIT_FAIL: "编码器初始化失败。",
    GAME_NOT_FOUND: "未找到该游戏",
    VERIFY_FROM_WEB: "后端服务器拒绝登录。",
    GAME_CFG_FILE: "游戏配置文件无效。",
    SPECTATOR_ONLINE_WHEN_NO_PLAYER: "没有在线玩家，无法旁观。",
    VIP_PRIVILEGE_NOT_MATCH: "不符合VIP权限。",
    GSM_NO_RESPONSE: "无法连接管理服务器。",
    PREPARE_GAME_ENV_FAIL: "准备游戏环境失败。",
    SERVER_REBOOTING: "正在重启，无法提供服务。"
}, window.gsKickMsgs = {
    UNKNOWN_ERROR: "未知原因",
    REQUIRED: "管理服务器要求下线。",
    GAME_PROC_CLOSE: "游戏进程退出。",
    CHARGE_TIMEUP: "游戏时长不足。",
    LONG_TIME_NO_INPUT: "长时间无操作。",
    CHARGE_COIN_FAILED: "扣币失败。",
    CHARGE_COIN_NOT_ENOUGH: "云币不足",
    NO_VIDEO_DEVICE_LEFT: "显卡设备资源不足。",
    TRIAL_OVER: "试玩结束。",
    ARENA_LOSE_BATTLE: "擂台失败。",
    KICKED_BY_OWNER: "被房主踢出",
    VIDEO_STREAM_CHANNEL_FAIL: "创建编码通道失败。",
    ONLY_SPECTATOR_LEFT: "没有在线玩家，终止旁观",
    SAME_ACCOUNT_ONLINE: "您的账号在别处登录。",
    ONLINE_LINK_TIMEOUT: "静默的客户端。",
    ONLINE_TIMEOUT: "登录超时。",
    ILLEGAL_BEHAVIOUR_MODIFY_DISPLAY: "禁止修改图像配置。",
    MODIFY_SYSTEM_FILE: "禁止修改系统文件。"
};
;
///<jscompress sourcefile="stat.js" />
"use strict";
var ClientStats = function () {
    function t() {
        this.lastReport = null, this.lastReportTime = 0, this.pingArr = [], this.pingMax = 0, this.getPingAvg = function () {
            if (0 === this.pingArr.length)return 0;
            let t = 0;
            for (let e = 0; e < this.pingArr.length; e++)t += this.pingArr[e];
            return t / this.pingArr.length
        }.bind(this)
    }

    return t.prototype = {
        updateStat: function (t) {
            if (0 === this.lastReportTime)this.lastReportTime = performance.now(), this.lastReport = t; else if (performance.now() - this.lastReportTime > 3e3) {
                let e = performance.now() - this.lastReportTime, i = {};
                i.net_delay_max = Math.max(0, parseInt(1e3 * this.pingMax)), i.net_delay_avg = Math.max(0, parseInt(1e3 * this.getPingAvg())), i.send_bandwidth = Math.max(0, parseInt((t.bytesSent - this.lastReport.bytesSent) / e * 8)), i.recv_bandwidth = Math.max(0, parseInt((t.bytesReceived - this.lastReport.bytesReceived) / e * 8)), i.udp_video_frame_received_count = Math.max(0, parseInt(t.framesDecoded - this.lastReport.framesDecoded)), i.udp_video_frame_lost_count = Math.max(0, parseInt(t.pliCount - this.lastReport.pliCount)), i.udp_video_frame_part_lost_count = Math.max(0, parseInt(t.keyFramesDecoded - this.lastReport.keyFramesDecoded)), i.udp_packet_received_count = Math.max(0, parseInt(t.packetsReceived - this.lastReport.packetsReceived)), i.udp_packet_overdue_count = Math.max(0, parseInt(t.packetsLost - this.lastReport.packetsLost)), i.udp_video_slice_lost_count = Math.max(0, parseInt(t.nackCount - this.lastReport.nackCount));
                let s = JSON.stringify(i);
                console.log(i), GoSendClientStats(s), this.lastReport = t, this.lastReportTime = performance.now(), this.pingMax = 0, this.pingArr = []
            }
            t.currentRoundTripTime && (this.pingMax = Math.max(this.pingMax, t.currentRoundTripTime), this.pingArr.push(t.currentRoundTripTime))
        }
    }, t
}();
;