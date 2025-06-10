# 🧠 Fractured - A Text-Based Psychological Thriller

## 📝 Overview

**Fractured** is an interactive **text-based adventure game** where players navigate the fractured mind of **Elias**, a mentally ill protagonist haunted by a voice known as *The Lapati*. The story unfolds through decision-driven acts, branching narratives, and psychological puzzles. As Elias spirals through delusion and fragments of truth, players must guide him toward his final reckoning.

This project merges **storytelling**, **software design**, and **psychological complexity** to deliver a gripping, choice-based narrative experience—all through a Java-based console interface.

---

## 🎮 Gameplay

You play as **Elias**, a man trapped between reality and psychosis. The story progresses through multiple **acts and parts**, each revealing new truths—or lies—about Elias’s past, his sister **Clara**, and the mysterious force *The Lapati*.

- Make choices that influence the outcome of the game.
- Solve puzzles embedded in the narrative.
- Engage with Elias’s inner voice (*The Lapati*) in unsettling dialogues.
- Navigate multiple endings based on your decisions.

---

## 🚀 Core Features

### ✅ Narrative-Based Decision Engine
- A rich story split into **Acts I to VI**, along with additional parts.
- Players' decisions affect the story arc, dialogues, and ultimate ending.

### ✅ Multi-Path Progression
- Each choice branches to a different outcome.
- Includes **false endings**, **delusional loops**, and **hidden truths**.

### ✅ Lapati Voice System
- *The Lapati* acts as an internal antagonist.
- Dynamic dialogues based on player choices simulate inner conflict.

### ✅ Puzzle and Logic Elements
- Certain acts include puzzles and challenges that require critical thinking.
- Puzzle results affect Elias's perception and storyline.

### ✅ Modularity
- Each act is structured as a separate module or function.
- Easy to extend or replace individual story segments.

---

## 🧩 Project Structure

2.🔒 Error Handling & Robustness
All inputs are validated to prevent crashes or logical inconsistencies.

Invalid commands prompt user-friendly error messages.

Robust try-catch blocks handle unexpected exceptions.

State fallback logic ensures Elias never gets "stuck" between acts.

3.🔄 Integration of Components
Each story component (Act, Part, Lapati voice, Puzzle) is independently implemented and integrated via the GameEngine.

Transitions between acts are smooth and state-aware.

All modules interact through shared game state variables managed centrally.

4.⚙️ Event Handling & Processing
A central command parser processes player inputs.

Story events are conditionally triggered based on player state and choices.

Dynamic narrative branching simulates hallucinations and false memories.

5. Data Validation
All player commands are validated before processing.

State variables (e.g., isClaraAlive, heardLapati, sanityLevel) are checked at every stage.

Optional save system includes file validation for integrity.

6.💡 Code Quality & Innovation
Clean, modular design with OOP principles.

Meaningful variable/method names, inline documentation, and consistent formatting.

Innovative elements include:

-The unreliable narrator design pattern.

-The Lapati system simulating auditory hallucinations.

-A "meta-ending" that rewrites player perception of the whole game.

7.🌱 Future Enhancements
GUI version using JavaFX or web-based interface (React + Java backend).

Voice synthesis for Elias and Lapati.

Enhanced replay system with multiple slots and route visualization.

Multiplayer or shared-choice mode.

Exportable story logs for narrative analysis.

8.🧠 Final Note
Fractured is more than a text-based game. It is a journey through trauma, delusion, and redemption. Designed to challenge players’ perception of reality while demonstrating solid programming practices and narrative innovation.

“Sometimes the mind breaks not with a scream, but with a whisper.”


