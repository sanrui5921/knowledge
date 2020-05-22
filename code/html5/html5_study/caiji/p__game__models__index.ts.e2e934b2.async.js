(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[6], {
    QZmh: function (e, n, t) {
        "use strict";
        t.r(n);
        var r = t("A1Zm"), o = t("3a4m"), a = t.n(o), u = t("T3mx"), c = ["", "webkit", "moz"], i = function () {
            Object(u["a"])(!1)
        }, s = function (e) {
            var n = Object(u["d"])();
            n || Object(u["a"])(!1), e(n)
        }, l = function (e) {
            window.oncontextmenu = function () {
                return !1
            }, window.onselectstart = function () {
                return !1
            };
            for (var n = 0, t = c.length; n < t; ++n)document.addEventListener(c[n] + "fullscreenchange", s(e)), document.addEventListener(c[n] + "fullscreenerror", i());
            document.addEventListener("MSFullscreenChange", s(e)), document.addEventListener("MSFullscreenError", i())
        }, d = function (e) {
            window.oncontextmenu = function () {
                return !0
            }, window.onselectstart = function () {
                return !0
            };
            for (var n = 0, t = c.length; n < t; ++n)document.removeEventListener(c[n] + "fullscreenchange", s(e)), document.removeEventListener(c[n] + "fullscreenerror", i());
            document.removeEventListener("MSFullscreenChange", s(e)), document.removeEventListener("MSFullscreenError", i())
        }, f = function () {
            return f = Object.assign || function (e) {
                    for (var n, t = 1, r = arguments.length; t < r; t++)for (var o in n = arguments[t], n)Object.prototype.hasOwnProperty.call(n, o) && (e[o] = n[o]);
                    return e
                }, f.apply(this, arguments)
        };
        n["default"] = {
            namespace: "privateGame",
            state: {showControl: !1, showLoading: !1, isFullScreen: !1, timerCount: 0},
            subscriptions: {
                setup: function (e) {
                    var n = e.dispatch, t = e.history;
                    t.listen(function (e) {
                        if ("/game.html" === e.pathname) {
                            if (console.log(e), window.location.href.indexOf("redirect") > -1)return void a.a.push("/game");
                            if (!r["a"].isLogin())return void a.a.push("/home");
                            l(function (e) {
                                n({type: "updateState", payload: {isFullScreen: e}})
                            }), n({type: "updateState", payload: {showLoading: !0}})
                        } else d(function (e) {
                            n({type: "updateState", payload: {isFullScreen: e}})
                        })
                    })
                }
            },
            reducers: {
                updateState: function (e, n) {
                    var t = n.payload;
                    return f(f({}, e), t)
                }
            },
            effects: {}
        }
    }
}]);
//# sourceMappingURL=p__game__models__index.ts.e2e934b2.async.js.map