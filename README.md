# LineWrapContainer
A custom line wrap layout ,support set max lines.

# How to use

**Step1:** Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

**Step2:** Add the dependency
```gradle
dependencies {
	        compile 'com.github.zhengcx:LineWrapContainer:1.1'
	}
```
**Step3:** Use it in your layout file.

```xml
 <cn.davidsu.library.LineWrapContainer
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:maxLines="2"
        app:horizontalSpace="10dp"
        app:verticalSpace="10dp">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="5dp"
            android:text="AndroidDeveloper" />
</cn.davidsu.library.LineWrapContainer>
```

**PS: you can also add child view in java code.**
