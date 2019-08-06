# OnePlus screen refresh rate switcher

Just a simple shortcut menu toggle for switching between 60 Hz and 90 Hz refresh rate on the OnePlus 7 Pro

<img src="https://github.com/ti0ma/oneplus-screen-shortcut/raw/master/capture.jpg" width="250" alt="OnePlus screen refresh" />

# Motivation

Basically I got tired doing up to 5 steps each time I wanted to switch between refresh rates for saving battery life or for playing Pokemon GO (it's harder to get a curve ball 😅). I needed something quicker, so I created this APP.

# But... How can you switch it?

Simple! Each time you switch it over settings menu you change the `oneplus_screen_refresh_rate` global value setting it to `1` when `60 Hz` and `2`when it's `90 Hz`.

# Installation

- Download the [app](https://github.com/ti0ma/oneplus-screen-shortcut/releases/download/v1.0/OnePlusRefreshRateSwitch.apk) 🚀
- Install it in your awesome OnePlus 7 Pro 🤩
- Enable developer tools (Settings -> about phone -> click on "Build number" several times) 🛠
- Enable USB debugging (Settings -> System -> Developer options -> USB Debugging) 🔬
- Set up ADB ([More info](https://www.xda-developers.com/quickly-install-adb/)) 🛠
- Run `adb shell pm grant me.molonosov.oprefreshrate android.permission.WRITE_SECURE_SETTINGS` (Without this permission the application would not be able to change the parameter) 💻

Now, you can edit the quick settings layout and add the `Tile` whereever you want ;)

© Artem Molonosov 2019
MIT License
