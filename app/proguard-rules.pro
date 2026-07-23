# Keep kotlinx.serialization
-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.AnnotationsKt
-keepclassmembers class kotlinx.serialization.json.** {
    *** Companion;
}
-keepclasseswithmembers class kotlinx.serialization.json.** {
    kotlinx.serialization.KSerializer serializer(...);
}
-keep,includedescriptorclasses class com.cnovel.app.**$$serializer { *; }
-keepclassmembers class com.cnovel.app.** {
    *** Companion;
}
-keepclasseswithmembers class com.cnovel.app.** {
    kotlinx.serialization.KSerializer serializer(...);
}
