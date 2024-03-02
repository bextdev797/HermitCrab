# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.hermitcrab.HermitCrab {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/hermitcrab/repack'
-flattenpackagehierarchy
-dontpreverify
