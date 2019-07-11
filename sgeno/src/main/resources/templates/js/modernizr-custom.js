/*! modernizr 3.2.0 (Custom Build) | MIT *
 * http://modernizr.com/download/?-cssanimations-prefixed !*/
!function (e, n, t) {
    function r(e, n) {
        return typeof e === n
    }

    function o() {
        var e, n, t, o, i, s, a;
        for (var f in C) if (C.hasOwnProperty(f)) {
            if (e = [], n = C[f], n.name && (e.push(n.name.toLowerCase()), n.options && n.options.aliases && n.options.aliases.length)) for (t = 0; t < n.options.aliases.length; t++) e.push(n.options.aliases[t].toLowerCase());
            for (o = r(n.fn, "function") ? n.fn() : n.fn, i = 0; i < e.length; i++) s = e[i], a = s.split("."), 1 === a.length ? Modernizr[a[0]] = o : (!Modernizr[a[0]] || Modernizr[a[0]] instanceof Boolean || (Modernizr[a[0]] = new Boolean(Modernizr[a[0]])), Modernizr[a[0]][a[1]] = o), g.push((o ? "" : "no-") + a.join("-"))
        }
    }

    function i(e) {
        var n = w.className, t = Modernizr._config.classPrefix || "";
        if (x && (n = n.baseVal), Modernizr._config.enableJSClass) {
            var r = new RegExp("(^|\\s)" + t + "no-js(\\s|$)");
            n = n.replace(r, "$1" + t + "js$2")
        }
        Modernizr._config.enableClasses && (n += " " + t + e.join(" " + t), x ? w.className.baseVal = n : w.className = n)
    }

    function s(e) {
        return e.replace(/([a-z])-([a-z])/g, function (e, n, t) {
            return n + t.toUpperCase()
        }).replace(/^-/, "")
    }

    function a(e, n) {
        return !!~("" + e).indexOf(n)
    }

    function f() {
        return "function" != typeof n.createElement ? n.createElement(arguments[0]) : x ? n.createElementNS.call(n, "http://www.w3.org/2000/svg", arguments[0]) : n.createElement.apply(n, arguments)
    }

    function l(e, n) {
        return function () {
            return e.apply(n, arguments)
        }
    }

    function u(e, n, t) {
        var o;
        for (var i in e) if (e[i] in n) return t === !1 ? e[i] : (o = n[e[i]], r(o, "function") ? l(o, t || n) : o);
        return !1
    }

    function p(e) {
        return e.replace(/([A-Z])/g, function (e, n) {
            return "-" + n.toLowerCase()
        }).replace(/^ms-/, "-ms-")
    }

    function d() {
        var e = n.body;
        return e || (e = f(x ? "svg" : "body"), e.fake = !0), e
    }

    function c(e, t, r, o) {
        var i, s, a, l, u = "modernizr", p = f("div"), c = d();
        if (parseInt(r, 10)) for (; r--;) a = f("div"), a.id = o ? o[r] : u + (r + 1), p.appendChild(a);
        return i = f("style"), i.type = "text/css", i.id = "s" + u, (c.fake ? c : p).appendChild(i), c.appendChild(p), i.styleSheet ? i.styleSheet.cssText = e : i.appendChild(n.createTextNode(e)), p.id = u, c.fake && (c.style.background = "", c.style.overflow = "hidden", l = w.style.overflow, w.style.overflow = "hidden", w.appendChild(c)), s = t(p, e), c.fake ? (c.parentNode.removeChild(c), w.style.overflow = l, w.offsetHeight) : p.parentNode.removeChild(p), !!s
    }

    function m(n, r) {
        var o = n.length;
        if ("CSS" in e && "supports" in e.CSS) {
            for (; o--;) if (e.CSS.supports(p(n[o]), r)) return !0;
            return !1
        }
        if ("CSSSupportsRule" in e) {
            for (var i = []; o--;) i.push("(" + p(n[o]) + ":" + r + ")");
            return i = i.join(" or "), c("@supports (" + i + ") { #modernizr { position: absolute; } }", function (e) {
                return "absolute" == getComputedStyle(e, null).position
            })
        }
        return t
    }

    function v(e, n, o, i) {
        function l() {
            p && (delete z.style, delete z.modElem)
        }

        if (i = r(i, "undefined") ? !1 : i, !r(o, "undefined")) {
            var u = m(e, o);
            if (!r(u, "undefined")) return u
        }
        for (var p, d, c, v, h, y = ["modernizr", "tspan"]; !z.style;) p = !0, z.modElem = f(y.shift()), z.style = z.modElem.style;
        for (c = e.length, d = 0; c > d; d++) if (v = e[d], h = z.style[v], a(v, "-") && (v = s(v)), z.style[v] !== t) {
            if (i || r(o, "undefined")) return l(), "pfx" == n ? v : !0;
            try {
                z.style[v] = o
            } catch (g) {
            }
            if (z.style[v] != h) return l(), "pfx" == n ? v : !0
        }
        return l(), !1
    }

    function h(e, n, t, o, i) {
        var s = e.charAt(0).toUpperCase() + e.slice(1), a = (e + " " + b.join(s + " ") + s).split(" ");
        return r(n, "string") || r(n, "undefined") ? v(a, n, o, i) : (a = (e + " " + N.join(s + " ") + s).split(" "), u(a, n, t))
    }

    function y(e, n, r) {
        return h(e, t, t, n, r)
    }

    var g = [], C = [], _ = {
        _version: "3.2.0",
        _config: {classPrefix: "", enableClasses: !0, enableJSClass: !0, usePrefixes: !0},
        _q: [],
        on: function (e, n) {
            var t = this;
            setTimeout(function () {
                n(t[e])
            }, 0)
        },
        addTest: function (e, n, t) {
            C.push({name: e, fn: n, options: t})
        },
        addAsyncTest: function (e) {
            C.push({name: null, fn: e})
        }
    }, Modernizr = function () {
    };
    Modernizr.prototype = _, Modernizr = new Modernizr;
    var w = n.documentElement, x = "svg" === w.nodeName.toLowerCase(), S = "Moz O ms Webkit",
        b = _._config.usePrefixes ? S.split(" ") : [];
    _._cssomPrefixes = b;
    var E = function (n) {
        var r, o = prefixes.length, i = e.CSSRule;
        if ("undefined" == typeof i) return t;
        if (!n) return !1;
        if (n = n.replace(/^@/, ""), r = n.replace(/-/g, "_").toUpperCase() + "_RULE", r in i) return "@" + n;
        for (var s = 0; o > s; s++) {
            var a = prefixes[s], f = a.toUpperCase() + "_" + r;
            if (f in i) return "@-" + a.toLowerCase() + "-" + n
        }
        return !1
    };
    _.atRule = E;
    var N = _._config.usePrefixes ? S.toLowerCase().split(" ") : [];
    _._domPrefixes = N;
    var P = {elem: f("modernizr")};
    Modernizr._q.push(function () {
        delete P.elem
    });
    var z = {style: P.elem.style};
    Modernizr._q.unshift(function () {
        delete z.style
    }), _.testAllProps = h;
    _.prefixed = function (e, n, t) {
        return 0 === e.indexOf("@") ? E(e) : (-1 != e.indexOf("-") && (e = s(e)), n ? h(e, n, t) : h(e, "pfx"))
    };
    _.testAllProps = y, Modernizr.addTest("cssanimations", y("animationName", "a", !0)), o(), i(g), delete _.addTest, delete _.addAsyncTest;
    for (var T = 0; T < Modernizr._q.length; T++) Modernizr._q[T]();
    e.Modernizr = Modernizr
}(window, document);