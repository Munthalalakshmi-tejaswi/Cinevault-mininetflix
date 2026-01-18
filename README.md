# 🎬 Mini Netflix (CineVault)

![Platform](https://img.shields.io/badge/Platform-Android-green)
![API Level](https://img.shields.io/badge/API-35%2B-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

A sleek, dark-themed Android application that allows users to browse a collection of movie trailers and play them instantly. This project demonstrates the use of **RecyclerView**, **Serializable Data Passing**, and **VideoView** integration.

---

## 📱 Features
* **Splash Screen:** Professional branding with a 3-second delay.
* **Home Menu:** Navigate between Browsing, Search, and Profile.
* **Movie Catalog:** A list of 5 curated movies with high-quality posters.
* **On-Click Playback:** Click any movie to view details and play the trailer.
* **Integrated Controls:** Built-in Play/Pause/Seek functionality via `MediaController`.

---

## 🛠️ Tech Stack & Architecture
| Component | Technology |
| :--- | :--- |
| **Language** | Java |
| **UI Layout** | XML (ConstraintLayout & LinearLayout) |
| **List Handling** | RecyclerView + Custom Adapter |
| **Video Playback** | VideoView + MediaController |
| **Build System** | Gradle 8.8.0 |

---

## 📁 Project Structure & Files



| File | Purpose |
| :--- | :--- |
| `SplashActivity.java` | Handles the initial loading screen. |
| `MoviesListActivity.java` | Manages the list of 5 movies using a RecyclerView. |
| `MovieDetailActivity.java` | Plays the video and displays descriptions. |
| `Movie.java` | The Data Model (Serializable) for movie objects. |
| `res/raw/` | **Critical:** Store your `.mp4` files here. |
| `res/drawable/` | Store your movie posters (`.jpg`/`.png`) here. |

---

## 🚀 Setup Instructions

1. **Clone the Repo**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/Mini-Netflix.git](https://github.com/YOUR_USERNAME/Mini-Netflix.git)
