# ![Build It Bigger icon](https://raw.githubusercontent.com/fjoglar/build-it-bigger/master/app/src/main/res/mipmap-mdpi/ic_launcher_round.png) Build It Bigger

[![License Apache 2.0](https://img.shields.io/badge/license-Apache%202.0-green.svg)](https://github.com/fjoglar/build-it-bigger/blob/master/LICENSE.txt)
[![fjoglar twitter](https://img.shields.io/badge/twitter-@felipejoglar-blue.svg)](http://twitter.com/felipejoglar)
[![Platform Android](https://img.shields.io/badge/platform-Android-blue.svg)](https://www.android.com)

This project contains an app with multiple flavors that uses multiple libraries and Google Cloud Endpoints. The finished app consists of four modules:

<p align="center">
<img src="https://github.com/fjoglar/build-it-bigger/blob/master/assets/scheme.png" width="500" style="width: 10px;"/>
</p>

- A Java library that provides jokes.
- Google Cloud Endpoints (GCE) project that serves those jokes.
- An Android Library containing an activity for displaying jokes.
- An Android app that fetches jokes from the GCE module and passes them to the Android Library for display.

<p align="center">
<img src="https://github.com/fjoglar/build-it-bigger/blob/master/assets/screens.png" alt="Phone" style="width: 10px;"/>
</p>


## How to build the app

1. Clone this repository in your local machine:

```
git clone https://github.com/fjoglar/build-it-bigger.git
```

2. Open Android Studio and open the project from `File > Open...`

3. Get an [AdMob App ID](https://support.google.com/admob/answer/6232340).

4. Then inside the `gradle.properties` file substitute `your_admob_app_id` with your actual App ID. Remember to not push your key to any public repository.

```
# AdMob App ID
admobAppId = "your_admob_app_id"
```

## Languages, libraries and tools used

* [Java](https://docs.oracle.com/javase/8/)
* Android Support Libraries
* [Butterknife](https://github.com/JakeWharton/butterknife)
* [Google Mobile Ads SDK for Android](https://developers.google.com/admob/android/quick-start)
* [Google Cloud](https://cloud.google.com/sdk/docs/)


## Requirements

* JDK 1.8
* [Android SDK](https://developer.android.com/studio/index.html)
* Android O ([API 27](https://developer.android.com/preview/api-overview.html))
* Latest Android SDK Tools and build tools.

## License

```
Copyright 2018 Felipe Joglar Santos

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

>##### **NOTE:** This project was submitted by Felipe Joglar as part of the Android Developer Nanodegree At Udacity.
>##### As part of Udacity Honor code, your submissions must be your own work, hence submitting this project as yours will cause you to break the Udacity Honor Code and the suspension of your account.
>##### Me, the author of the project, allow you to check the code as a reference, but if you submit it, it's your own responsibility if you get expelled.
>##### Besides this notice, the above license applies and this license notice must be included in all works derived from this project.
