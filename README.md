# ArscBlamer

A editor tool for Android APK resources.arsc or xml

copy from https://cs.android.com/android-studio/platform/tools/base/+/mirror-goog-studio-main:apkparser/binary-resources/

# Note
We highly recommend use aapt-proto
```
implementation("com.android.tools.build:aapt2-proto:<version>")
```
Which is java pb from:
https://android.googlesource.com/platform/frameworks/base/+/master/tools/aapt2/Resources.proto

And you can use `aapt2 convert` convert binary format to proto and then use aapt2-proto
after updating, convert to binary
https://developer.android.com/tools/aapt2#convert

