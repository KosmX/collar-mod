# Glue 1.17 without Forge  

To make it work, I had to change glue to be a fabric mod, not an arch common module  

If forge will come out for MC 1.17, do it back:

```diff
@@ -8,7 +8,7 @@

architectury{
injectInjectables = false
-    common(false)
+    common()
     }

dependencies {

```
