# LOC8 — Travel & Navigation Mobile Application

LOC8 is an Android travel companion that helps users explore the **Philippines** region-by-region. Browse featured destinations, view hotels, check the weather, and navigate using Google Maps — all in one app, backed by Firebase Authentication.

> Built as a mobile development project covering all three island groups (Luzon, Visayas, Mindanao) and every administrative region of the Philippines.

---

## Table of Contents

- [Features](#features)
- [Screens](#screens)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Building & Running](#building--running)
- [Permissions](#permissions)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- **User authentication** — Email/password sign-up and login via Firebase Auth.
- **Featured destinations** — Curated highlights across the Philippines.
- **Region-by-region browsing** — Dedicated screens for every Philippine region:
  - **Luzon** — NCR, CAR, Region 1 (Ilocos), Region 2 (Cagayan Valley), Region 3 (Central Luzon), Region 4A (CALABARZON), Region 4B (MIMAROPA), Region 5 (Bicol)
  - **Visayas** — Region 6 (Western Visayas), Region 7 (Central Visayas), Region 8 (Eastern Visayas)
  - **Mindanao** — Region 9 (Zamboanga Peninsula), Region 10 (Northern Mindanao), Region 11 (Davao), Region 12 (SOCCSKSARGEN), Region 13 (Caraga), BARMM
- **Interactive maps** — Powered by Google Maps SDK for Android.
- **Hotels** — Browse accommodation suggestions per destination.
- **Weather** — Current conditions for travel planning.
- **Favorites** — Save destinations you want to revisit.
- **Notifications** — In-app updates and reminders.
- **Profile & settings** — Edit profile, manage preferences.

## Screens

The app ships ~30 activities. Highlights:

| Activity        | Purpose                                            |
|-----------------|----------------------------------------------------|
| `Login`         | Email/password sign-in (Firebase Auth)             |
| `Register`      | Account creation                                   |
| `MainActivity`  | Home — entry point to all categories               |
| `Featured` 1–3  | Curated featured destinations                      |
| `Luzon`/`Visayas`/`Mindanao` | Island-group hubs                     |
| `Region1`–`Region13`, `NCR`, `CAR`, `BARMM` | Per-region listings    |
| `Hotel`         | Hotel browser                                      |
| `Weather`       | Weather lookup                                     |
| `Location`      | Map view with current location                     |
| `Favorites`     | Saved destinations                                 |
| `Notifications` | In-app notifications                               |
| `Profile` / `EditProfile` / `Settings` | Account management          |

## Tech Stack

- **Language:** Java
- **Min SDK:** 26 (Android 8.0 Oreo)
- **Target/Compile SDK:** 34 (Android 14)
- **Build system:** Gradle (Kotlin DSL) 8.1.4
- **Authentication:** Firebase Auth `22.3.1`
- **Maps:** Google Play Services — Maps `18.2.0`
- **Networking:** Volley `1.2.1`
- **UI:** AndroidX AppCompat, Material Components, ConstraintLayout, CardView

## Project Structure

```
TRYY/
├── app/
│   ├── build.gradle.kts          # App-module Gradle config (reads MAPS_API_KEY)
│   ├── google-services.json      # Firebase config
│   ├── proguard-rules.pro
│   └── src/main/
│       ├── AndroidManifest.xml   # Activities, permissions, Maps meta-data
│       ├── java/com/example/tryy/
│       │   ├── MainActivity.java
│       │   ├── Login.java, Register.java
│       │   ├── Luzon.java, Visayas.java, Mindanao.java
│       │   ├── Region1.java … Region13.java, NCR, CAR, BARMM
│       │   ├── Featured.java, Featured2.java, Featured3.java
│       │   ├── Hotel.java, Weather.java, Location.java
│       │   ├── Favorites.java, Notifications.java
│       │   ├── Profile.java, EditProfile.java, Settings.java, User.java
│       │   └── …
│       └── res/                  # Layouts, drawables, mipmaps, fonts, values
├── build.gradle.kts              # Project-level Gradle config
├── settings.gradle.kts
├── gradle.properties
├── local.properties              # SDK path + MAPS_API_KEY (gitignored)
└── local.properties.sample       # Template for new contributors
```

## Getting Started

### Prerequisites

- **Android Studio** Hedgehog (2023.1.1) or newer
- **JDK 17** (bundled with recent Android Studio)
- **Android SDK** Platform 34 + Build-Tools
- A **Google Maps API key** ([get one here](https://console.cloud.google.com/google/maps-apis))
- A **Firebase project** with Authentication enabled ([Firebase Console](https://console.firebase.google.com/))

### Clone

```bash
git clone https://github.com/JeraldSpares/LOC8-Travel-and-Navigation-Mobile-Application.git
cd LOC8-Travel-and-Navigation-Mobile-Application
```

## Configuration

### 1. `local.properties`

Copy the template and fill in your values:

```bash
cp local.properties.sample local.properties
```

Edit `local.properties`:

```properties
sdk.dir=C\:\\Users\\YOUR_USER\\AppData\\Local\\Android\\Sdk
MAPS_API_KEY=YOUR_GOOGLE_MAPS_API_KEY
```

The Maps key is read by Gradle and injected into `AndroidManifest.xml` as a manifest placeholder — **never hardcode it in source**.

> **Restrict your key.** In Google Cloud Console, restrict the key to the Android package name `com.example.tryy` and your debug/release **SHA-1** fingerprints.

### 2. Firebase

The repo includes `app/google-services.json` for the original Firebase project (`test-c5dd9`). To use your own Firebase project:

1. Create a project at https://console.firebase.google.com/
2. Add an Android app with package name `com.example.tryy`.
3. Enable **Authentication → Email/Password**.
4. Download `google-services.json` and replace `app/google-services.json`.

## Building & Running

From Android Studio: **Run ▶︎** on a device or emulator (API 26+).

Or from the command line:

```bash
# Windows
gradlew.bat assembleDebug

# macOS/Linux
./gradlew assembleDebug
```

The APK lands in `app/build/outputs/apk/debug/`.

## Permissions

Declared in `AndroidManifest.xml`:

| Permission                | Why                                           |
|---------------------------|-----------------------------------------------|
| `ACCESS_FINE_LOCATION`    | Precise location for map centering            |
| `ACCESS_COARSE_LOCATION`  | Network-based location fallback               |
| `ACCESS_NETWORK_STATE`    | Detect connectivity before network calls      |
| `INTERNET`                | Firebase Auth, Maps tiles, Volley requests    |

## Roadmap

Possible future enhancements:

- [ ] Migrate Java activities to Kotlin + Jetpack Compose
- [ ] Use a single `RegionDetailActivity` driven by data instead of one activity per region
- [ ] Persist favorites to Firestore so they sync across devices
- [ ] Offline map tiles for low-connectivity travel scenarios
- [ ] Dark mode polish in `values-night/`
- [ ] Add CI (GitHub Actions) running `./gradlew lint test`
- [ ] Unit and instrumentation tests

## Contributing

1. Fork the repo and create a feature branch: `git checkout -b feat/your-feature`
2. Commit your changes: `git commit -m "feat: add your feature"`
3. Push the branch: `git push origin feat/your-feature`
4. Open a Pull Request.

Please make sure your `local.properties` is **not** committed and that no API keys appear in any committed file.

## License

This project is provided for educational purposes. Add a license of your choice (MIT, Apache-2.0, etc.) by dropping a `LICENSE` file in the repo root.

---

**Author:** [@JeraldSpares](https://github.com/JeraldSpares)
