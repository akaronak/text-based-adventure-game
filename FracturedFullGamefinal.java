import java.util.Scanner; 
 
public class FracturedFullGame { 
    static Scanner input = new Scanner(System.in); 
    static int sanity = 100; 
    static boolean memoryUnlocked = false; 
    static boolean foundClue = false; 
    static boolean puzzleSolved = false; 
    static boolean notebookDecoded = false; 
    static boolean fullyUnderstood = false; 
    static boolean graveNamed = false; 
    static int insight = 0; 
 
    public static void main(String[] args) { 
        // ACT I 
        act1_intro(); 
        act1_firstChoice(); 
        act1_kitchenScene(); 
        act1_voiceWhisper(); 
        System.out.println("\n--- END OF ACT I ---\n"); 
 
        // PART I 
        part1_introFlashback(); 
        part1_traumaChoice(); 
        part1_schoolScene(); 
        part1_roomScene(); 
        part1_conclusion(); 
 
 
        // ACT II 
        act2_newsScene(); 
        act2_hallucinationScene(); 
        act2_memoryPuzzle(); 
        act2_conclusion(); 
 
        // ACT III 
        act3_intro(); 
        act3_choice1(); 
        act3_confrontDrifter(); 
        act3_searchRoom(); 
        act3_conclusion(); 
 
        // ACT IV 
        act4_intro(); 
        act4_hallucinationBreakdown(); 
        act4_memoryPuzzle(); 
        act4_conclusion(); 
 
        // ACT V 
        act5_intro(); 
        act5_discoverBody(); 
        act5_notebookPuzzle(); 
        act5_conclusion(); 
 
        // PART 2 
        part2_intro(); 
        part2_therapyFiles(); 
        part2_counselorScene(); 
        part2_photoMemory(); 
        part2_conclusion(); 
 
        // ACT VI 
        act6_intro(); 
        act6_puzzle(); 
        act6_conclusion(); 
    } 
 
    // === ACT I === 
    public static void act1_intro() { 
        System.out.println("╔════════════════════════════════╗"); 
        System.out.println("║         F R A C T U R E D     ║"); 
        System.out.println("╚════════════════════════════════╝"); 
        System.out.println("\nYou wake up in a dim room, a dull headache pounding behind your 
eyes."); 
        System.out.println("The air is heavy. Something feels... wrong.\n"); 
        System.out.println("A voice whispers...\n>>You are the one... <<\n"); 
    } 
 
    public static void act1_firstChoice() { 
        System.out.println("What do you do?"); 
        System.out.println("1. Shake it off and go to the kitchen."); 
        System.out.println("2. Talk back to the voice."); 
        System.out.print("Enter your choice (1 or 2): "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            System.out.println("\nYou ignore the voice, trying to convince yourself it's just a dream."); 
        } else if (choice == 2) { 
            sanity -= 10; 
            System.out.println("\nYou whisper back: 'Who are you?'"); 
            System.out.println("The voice lingers in your ears..."); 
            System.out.println(">> You are the one. You let her die. <<"); 
            System.out.println("Your hands tremble. Is this real?"); 
        } else { 
            System.out.println("\nInvalid choice. You freeze in fear. The voice fades..."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act1_kitchenScene() { 
        System.out.println("\nYou step into the kitchen. Morning light spills in weakly."); 
        System.out.println("Clara stands at the stove, flipping eggs."); 
        System.out.println("She turns, smiling gently."); 
        System.out.println("\nCLARA: You did not sleep again, huh?"); 
 
        System.out.println("\nHow do you respond?"); 
        System.out.println("1. 'I'm fine. Just a weird dream.'"); 
        System.out.println("2. 'I heard... something.'"); 
        System.out.print("Enter your choice (1 or 2): "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            System.out.println("\nCLARA: You always say that. She frowns, concern in her eyes."); 
        } else if (choice == 2) { 
            sanity -= 5; 
            System.out.println("\nCLARA: Again? The voice? Elias, you need to tell someone..."); 
            System.out.println("You look away. The room feels smaller now."); 
        } else { 
            System.out.println("\nCLARA: You are scaring me, Elias."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act1_voiceWhisper() { 
        System.out.println("\nAs Clara pours coffee, the voice returns—closer this time."); 
        System.out.println(">> She is lying. She is not real. <<"); 
 
        System.out.println("\nWhat do you do?"); 
        System.out.println("1. Ignore it and sit with Clara."); 
        System.out.println("2. Stare at her... unsure if she is even real."); 
        System.out.print("Enter your choice (1 or 2): "); 
        int choice = input.nextInt(); 
 
        if (choice == 1) { 
            System.out.println("\nYou sit with Clara. She talks about simple things—weather, dreams."); 
            System.out.println("You try to focus. The voice fades... just for now."); 
        } else if (choice == 2) { 
            sanity -= 10; 
            System.out.println("\nYou just watch her. Her hands. Her eyes."); 
            System.out.println("She looks up, unsettled. Elias? What is wrong?"); 
            System.out.println("You cannot answer. You are not sure who she is anymore."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
     
        // === PART I: THE PAST === 
    static boolean suppressedMemory = false; 
 
    public static void part1_introFlashback() { 
        System.out.println("\n--- PART I: THE PAST ---\n"); 
        System.out.println("FLASHBACK: Night. Sirens scream. You are 10 years old, hiding behind the 
couch."); 
        System.out.println("You peek through the darkness… your parents lie motionless. Blood 
spreads across the floor."); 
        System.out.println("Your sister, Clara, grabs you, shielding your eyes."); 
        System.out.println("\nCLARA: Dont look, Elias! Dont look!\n"); 
 
        System.out.println("How do you react?"); 
        System.out.println("1. Cry and ask what happened."); 
        System.out.println("2. Go numb and say nothing."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            System.out.println("\nYou cry uncontrollably. Your mind floods with questions, panic, pain."); 
            sanity -= 10; 
        } else { 
            System.out.println("\nYou freeze. The world dims. Something inside you shuts off."); 
            sanity -= 5; 
            suppressedMemory = true; 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void part1_traumaChoice() { 
        System.out.println("\nLater that week, a therapist asks if you remember the night."); 
        System.out.println("You see Clara hand twitching nervously beside you."); 
 
        System.out.println("What do you say?"); 
        System.out.println("1. 'I remember everything.'"); 
        System.out.println("2. 'I dont want to talk about it.'"); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            sanity -= 15; 
            System.out.println("\nThe words burn your throat. The memories come rushing back... too 
fast."); 
        } else { 
            sanity -= 5; 
            suppressedMemory = true; 
            System.out.println("\nYou shake your head. The therapist nods slowly. Clara squeezes your 
hand."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void part1_schoolScene() { 
        System.out.println("\nINT. SCHOOL - DAY (Years later)"); 
        System.out.println("You are in class. The teacher calls your name."); 
        System.out.println("But all you see is your mothers bloodied face."); 
 
        System.out.println("How do you cope?"); 
        System.out.println("1. Write poems about your parents."); 
        System.out.println("2. Tear their photos and hide them."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            sanity -= 10; 
            System.out.println("\nYou try to make sense of it. But your poems are dark. Disturbing."); 
        } else { 
            sanity -= 5; 
            suppressedMemory = true; 
            System.out.println("\nYou rip the photos. You bury them under your bed. You stop saying 
their names."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void part1_roomScene() { 
        System.out.println("\nINT. ELIAS' ROOM – NIGHT"); 
        System.out.println("The walls are bare. Not a single family photo. Just silence."); 
 
        if (suppressedMemory) { 
            System.out.println("You stare at the ceiling. It is easier not to feel anything."); 
            System.out.println("Clara knocks. You pretend to sleep."); 
        } else { 
            System.out.println("You hold a photo of your parents. Tears blur their faces."); 
            System.out.println("Clara enters and holds you without speaking."); 
        } 
    } 
 
    public static void part1_conclusion() { 
        System.out.println("\n--- PART I CONCLUSION ---"); 
        if (suppressedMemory) { 
            System.out.println("Years later, you wont remember the color of your father eyes."); 
            System.out.println("You will barely remember Clara birthday. But the pain stays."); 
        } else { 
            System.out.println("You carry the memories like knives. Always cutting. Never healing."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
        System.out.println("--- END OF PART I ---\n"); 
    } 
 
 
    // === ACT II === 
    public static void act2_newsScene() { 
        System.out.println("\n--- ACT II: CLARA'S 'DEATH' ---\n"); 
        System.out.println("You sit in the dim light of the living room."); 
        System.out.println("The TV flickers. A breaking news report flashes across the screen."); 
        System.out.println("Young woman, Clara Grey, reported dead. Apparent homicide.\n"); 
 
        System.out.println("Your throat tightens. Your heart races. Sweat beads on your forehead."); 
        System.out.println("A photo of Clara appears—frozen in time, smiling... unaware.\n"); 
 
        System.out.println("What do you do?"); 
        System.out.println("1. Shout | NO!!! | and punch the wall."); 
        System.out.println("2. Stare at the photo, paralyzed."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            sanity -= 10; 
            System.out.println("\nYour fist connects with the wall. Pain. Blood. A crack in the plaster... 
and in your mind."); 
        } else { 
            sanity -= 5; 
            System.out.println("\nYou freeze. Time slows. The voice slithers back into your ear."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act2_hallucinationScene() { 
        System.out.println("\n>> The Lapati whispers: You are the one. You let her die. <<"); 
        System.out.println("You cover your ears, but the voice is inside now.\n"); 
 
        System.out.println("What do you do?"); 
        System.out.println("1. Scream back at the voice."); 
        System.out.println("2. Try to remember the last thing Clara said to you."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            sanity -= 10; 
            System.out.println("\nYou scream: |  GET OUT!!!  | But the voice laughs. A cruel, knowing 
sound."); 
        } else { 
            sanity -= 5; 
            System.out.println("\nYou close your eyes, reaching for the memory. It is there... but 
scattered."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act2_memoryPuzzle() { 
        System.out.println("\n>>> MEMORY PUZZLE: UNSCRAMBLE CLARA'S LAST WORDS <<<"); 
        System.out.println("The fragments come back to you like broken glass."); 
        System.out.println("Unscramble this sentence: 'erbroht ym evol I'"); 
 
        System.out.print("\nYour answer: "); 
        String answer = input.nextLine().trim().toLowerCase(); 
 
        if (answer.equals("i love my brother") || answer.equals("i love you brother")) { 
            memoryUnlocked = true; 
            System.out.println("\nYou remember—her voice, her warmth. 'I love you, brother.' It is clear 
now."); 
        } else { 
            System.out.println("\nNothing. The pieces dont fit. Your memory slips further into the fog."); 
            sanity -= 10; 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act2_conclusion() { 
        if (memoryUnlocked) { 
            System.out.println("\nYou clutch the memory like a lifeline. Clara's voice calms the 
chaos—just for a moment."); 
            System.out.println("But the news. The voice. The blood... they still echo."); 
        } else { 
            System.out.println("\nYour mind spirals. You cannot trust what you see. Or what you 
remember."); 
            System.out.println("Clara is dead. Isn't she? Or was she never there at all?"); 
        } 
 
        System.out.println("\n>> You are the one… << The Lapati whispers again."); 
        System.out.println("\n--- END OF ACT II ---\n"); 
    } 
    // === ACT III === 
    public static void act3_intro() { 
        System.out.println("\n--- ACT III: SEARCH FOR THE KILLER ---\n"); 
        System.out.println("The city is gray, smeared with rain. You walk fast. Eyes down. Thoughts 
spiraling."); 
        System.out.println("Every corner could hide her killer.\n"); 
        System.out.println(">> The Lapati hisses in your head: You are the one... you saw it. You did 
nothing. <<"); 
    } 
 
    public static void act3_choice1() { 
        System.out.println("\nWhere do you go first?"); 
        System.out.println("1. Police station to demand action."); 
        System.out.println("2. Back alley where Clara said she felt watched."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
 
        if (choice == 1) { 
            sanity -= 5; 
            System.out.println("\nYou burst into the police station. Rage in your voice. No one listens."); 
            System.out.println("DETECTIVE: There is no case, Elias. We have no evidence she is even 
dead."); 
            System.out.println("You storm out. The voice laughs inside your skull."); 
        } else if (choice == 2) { 
            System.out.println("\nYou return to the alley. Shadows stretch long. A flicker of 
movement—someone is there."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act3_confrontDrifter() { 
        System.out.println("\nYou spot a man loitering under a flickering lamp. Something about him... 
familiar."); 
        System.out.println("Do you confront him?"); 
        System.out.println("1. Yes – demand answers."); 
        System.out.println("2. No – keep watching from the shadows."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
 
        if (choice == 1) { 
            sanity -= 10; 
            System.out.println("\nYou grab him by the collar and shove him into the wall."); 
            System.out.println("ELIAS: Did you follow her?! TELL ME!"); 
            System.out.println("DRIFTER: I don't even know who you're talking about! Let go!"); 
            System.out.println("You punch. Blood. Screams. He escapes. Bystanders stare. You vanish 
into the night."); 
        } else if (choice == 2) { 
            System.out.println("\nYou wait. He lights a cigarette. A woman walks by. He does nothing."); 
            System.out.println("Maybe he wasn't the one..."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act3_searchRoom() { 
        System.out.println("\nBack in your apartment, your head pounds."); 
        System.out.println("The Lapati is louder. You know where the truth hides."); 
        System.out.println("Do you search the apartment?"); 
        System.out.println("1. Yes – check your room."); 
        System.out.println("2. No – it's too painful."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            foundClue = true; 
            sanity -= 5; 
            System.out.println("\nYou lift your mattress... and find Clara's white shirt."); 
            System.out.println("It is soaked with blood."); 
            System.out.println("Your hands shake. Flashbacks hit like thunder:"); 
            System.out.println("— Her scream. — A struggle. — You... holding something sharp."); 
            System.out.println("ELIAS: No... this isn't real... it can't be."); 
        } else { 
            sanity -= 15; 
            System.out.println("\nYou sit in the dark. The voice whispers over and over again:"); 
            System.out.println(">> You are the one... You are the one... You are the one... <<"); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act3_conclusion() { 
        System.out.println("\n--- ACT III CONCLUSION ---\n"); 
        if (foundClue) { 
            System.out.println("You stare at the bloodstained shirt."); 
            System.out.println("The memory floods back. Not her killer... but your hands... red."); 
            System.out.println("The voice quiets. A truth you can't unsee settles in your chest."); 
        } else { 
            System.out.println("You pace all night. Sanity fraying. The Lapati growing stronger."); 
            System.out.println("And you still don't know if Clara was ever real... or just your guilt given 
form."); 
        } 
 
        System.out.println("\n>> The Lapati breathes one last time this night: You saw the end before it 
began. <<"); 
    } 
    // === ACT IV === 
    public static void act4_intro() { 
        System.out.println("\n--- ACT IV: GUILT AND SUICIDE ---\n"); 
        System.out.println("The bloodstained shirt lies before you. Your mind fractures with every 
heartbeat."); 
        System.out.println(">> The Lapati roars: She screamed your name. You didn't stop. <<"); 
        System.out.println("You stagger into the bathroom. The mirror reflects a stranger."); 
        sanity -= 5; 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act4_hallucinationBreakdown() { 
        System.out.println("\nYou open the drawer. A razor blade glints inside."); 
        System.out.println("Next to it lies the notebook—your story, her story, your guilt."); 
        System.out.println("The Lapati whispers:\n>> It ends with you. It always has. <<"); 
 
        System.out.println("\nWhat do you do?"); 
        System.out.println("1. Open the notebook—try to make sense of it."); 
        System.out.println("2. Pick up the blade."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            System.out.println("\nYou open the notebook. Pages are frenzied—Clara's name scratched 
out, rewritten."); 
            System.out.println("A phrase repeats: She loved me... I killed her."); 
            sanity -= 5; 
        } else if (choice == 2) { 
            sanity -= 15; 
            System.out.println("\nYou hold the blade to your skin. The voice grows louder, like thunder 
behind your eyes."); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act4_memoryPuzzle() { 
        System.out.println("\n>>> PUZZLE: RECONSTRUCT THE FINAL MEMORY <<<"); 
        System.out.println("A memory breaks through—faint, like distant thunder."); 
        System.out.println("You hear Clara's voice: a phrase, out of order. Can you fix it?\n"); 
        System.out.println("Rearrange this sentence: 'only the always you not are one'"); 
 
        System.out.print("\nYour answer: "); 
        String response = input.nextLine().trim().toLowerCase(); 
 
        if (response.equals("you are not the only one always") || response.equals("you are not always 
the only one")) { 
            puzzleSolved = true; 
            System.out.println("\nHer voice pierces the fog: 'You were never alone, Elias. Not ever.'"); 
            System.out.println("The mirror cracks—but this time, it reveals her face, not blood."); 
            sanity += 10; 
        } else { 
            sanity -= 10; 
            System.out.println("\nThe words don't make sense. Her voice distorts. The Lapati laughs."); 
            System.out.println(">> You ARE the one. You always were. <<"); 
        } 
 
        System.out.println("\n(Sanity: " + sanity + ")"); 
    } 
 
    public static void act4_conclusion() { 
        System.out.println("\n--- ACT IV CONCLUSION ---\n"); 
        if (puzzleSolved) { 
            System.out.println("You drop the blade. Clara's memory wraps around you like warmth."); 
            System.out.println("You collapse to the floor—crying, not bleeding."); 
            System.out.println("The Lapati fades into silence. For now."); 
        } else { 
            System.out.println("You stare into the cracked mirror. The face is yours—but not."); 
            System.out.println("You press the blade down, slow... resigned."); 
            System.out.println("A final thought: Maybe she was never dead. Maybe it was me all along."); 
            System.out.println("Darkness embraces you."); 
        } 
 
        System.out.println("\n--- END OF ACT IV ---\n"); 
    } 
    // === ACT V === 
    public static void act5_intro() { 
        System.out.println("\n--- ACT V: CLARA RETURNS ---\n"); 
        System.out.println("You are Clara.\nYou stand at Elias's apartment door. You haven't heard from 
him in days."); 
        System.out.println("You unlock the door and step inside..."); 
    } 
 
    public static void act5_discoverBody() { 
        System.out.println("\nINT. ELIAS'S APARTMENT – DAY"); 
        System.out.println("The air is heavy. Still. The lights are off. The curtains drawn."); 
        System.out.println("You walk slowly, calling out..."); 
 
        System.out.println("\nCLARA: Elias...? It's me... it's Clara."); 
 
        System.out.println("\nNo answer."); 
        System.out.println("You open the bathroom door—"); 
        System.out.println("And there he is."); 
        System.out.println("Lying on the floor. Silent. Still. Blood dried at his side."); 
 
        System.out.println("\nYou scream. You fall beside him, grabbing his cold hand."); 
        System.out.println("Your eyes catch something near the sink: his **notebook**."); 
    } 
 
    public static void act5_notebookPuzzle() { 
        System.out.println("\n>>> PUZZLE: DECODE ELIAS' LAST MESSAGE <<<"); 
        System.out.println("The notebook is filled with madness—crossed-out names, repeating 
phrases."); 
        System.out.println("But there is a hidden code written backward across several pages."); 
 
        System.out.println("\nYou find this phrase written over and over in reverse:"); 
        System.out.println("\"uoy evigrof i ,revewoH .em evahs uoy taht yrots eht fo eno eht era uoY\""); 
 
        System.out.print("\nWhat is the correct decoded message? "); 
        String inputAnswer = input.nextLine().trim().toLowerCase(); 
 
        String correct = "you are the one of the story that you have me however i forgive you"; 
 
        if (inputAnswer.replaceAll("[^a-z]", "").equals(correct.replaceAll("[^a-z]", ""))) { 
            notebookDecoded = true; 
            System.out.println("\nYou whisper the words aloud: 'You are the one of the story... that you 
have me... however, I forgive you.'"); 
            System.out.println("Your breath catches. He blamed himself... but he never stopped loving 
you."); 
        } else { 
            System.out.println("\nThe words blur. You can't make sense of them."); 
            System.out.println("You close the notebook, tears falling on the ink."); 
        } 
    } 
 
    public static void act5_conclusion() { 
        System.out.println("\n--- ACT V CONCLUSION ---\n"); 
        if (notebookDecoded) { 
            System.out.println("You sit beside Elias's body, holding his hand."); 
            System.out.println("CLARA: You were never evil, Elias. Just broken... and afraid."); 
            System.out.println("You place the notebook on his chest, and kiss his forehead."); 
        } else { 
            System.out.println("You sit in silence, clutching the notebook. So much left unsaid."); 
            System.out.println("You open your phone—and call the only number that matters: the 
therapist who once treated him."); 
        } 
 
        System.out.println("\nYou walk out of the apartment, into the sun."); 
        System.out.println("The story isn't over. But the worst chapter has ended."); 
    } 
    // === PART 2: THE TRUTH AFTER DEATH === 
    public static void part2_intro() { 
        System.out.println("\n--- PART II: THE TRUTH AFTER DEATH ---\n"); 
        System.out.println("You are Clara. Days have passed since Elias's funeral."); 
        System.out.println("You are in his room, surrounded by what he left behind."); 
        System.out.println("His notebook lies open, pointing you toward the truth."); 
    } 
 
    public static void part2_therapyFiles() { 
        System.out.println("\nYou find a file labeled: Therapy Records – Elias Grey."); 
        System.out.println("Do you open and read them?"); 
        System.out.println("1. Yes – I need to know everything."); 
        System.out.println("2. No – I am afraid of what I will find."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            insight += 1; 
            System.out.println("\nYou flip through diagnosis after diagnosis:"); 
            System.out.println("- Dissociative Amnesia"); 
            System.out.println("- Severe PTSD"); 
            System.out.println("- Auditory Hallucinations (The Lapati)"); 
            System.out.println("You read one entry: Subject believes Clara never existed. Hallucinations 
are escalating."); 
        } else { 
            System.out.println("\nYou close the folder. The weight of it is too much."); 
        } 
    } 
 
    public static void part2_counselorScene() { 
        System.out.println("\nYou find a voice memo labeled, School Counselor, Age 14."); 
        System.out.println("Play the recording?"); 
        System.out.println("1. Yes – I need to hear it."); 
        System.out.println("2. No – I can't listen."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
        input.nextLine(); 
 
        if (choice == 1) { 
            insight += 1; 
            System.out.println("\nTAPE RECORDER PLAYS:"); 
            System.out.println("COUNSELOR: He says Clara never existed. But she sits next to him at 
every session."); 
            System.out.println("You feel your heart break all over again."); 
        } else { 
            System.out.println("\nYou delete the memo. Some wounds should stay closed."); 
        } 
    } 
 
    public static void part2_photoMemory() { 
        System.out.println("\nYou find a photo: You and Elias. Age 6. Laughing with your father."); 
        System.out.println("Burned edges. Ash on the frame."); 
        System.out.println("What do you do?"); 
        System.out.println("1. Keep it. Try to recall the memory."); 
        System.out.println("2. Let it go. He tried to forget it for a reason."); 
        System.out.print("Choice: "); 
        int choice = input.nextInt(); 
 
        if (choice == 1) { 
            insight += 1; 
            System.out.println("\nYou sit down and close your eyes."); 
            System.out.println("You remember the song he sang with Dad. You remember Elias crying 
the first time Dad left for work."); 
        } else { 
            System.out.println("\nYou place it back in the drawer, untouched. A piece of him forever 
lost."); 
        } 
    } 
 
    public static void part2_conclusion() { 
        System.out.println("\n--- PART II CONCLUSION ---\n"); 
 
        if (insight >= 2) { 
            fullyUnderstood = true; 
            System.out.println("You close your eyes and finally see the full picture."); 
            System.out.println("Elias wasn't cruel. He was afraid. And broken."); 
            System.out.println("You whisper to the empty room: You were never alone, Elias. I just wish 
you knew that."); 
        } else { 
            System.out.println("Some truths stay buried. But the ache doesn't fade."); 
            System.out.println("You press your palm to the wall, wishing he had left more behind."); 
        } 
 
        System.out.println("\n--- END OF PART II ---\n"); 
    } 
    // === ACT VI: EPILOGUE === 
    public static void act6_intro() { 
        System.out.println("\n--- ACT VI: EPILOGUE ---\n"); 
        System.out.println("You are Clara.\nDays have passed."); 
        System.out.println("You walk alone through a quiet graveyard, notebook in hand."); 
        System.out.println("You reach a small stone. No name carved. Just a patch of earth and 
silence.\n"); 
 
        System.out.println("You kneel beside it."); 
        System.out.println("CLARA: You werent weak, Elias. You were hurting."); 
        System.out.println("She opens the notebook one last time."); 
    } 
 
    public static void act6_puzzle() { 
        System.out.println("\n>>> FINAL PUZZLE: WHAT NAME BELONGS ON THE GRAVE? <<<"); 
        System.out.println("Clara reads Elias last entry. Three phrases are circled, each representing a 
version of Elias:"); 
        System.out.println("A) The monster who killed her"); 
        System.out.println("B) The voice puppet"); 
        System.out.println("C) The boy who tried to forget"); 
 
        System.out.println("\nWhich name should Clara write on the grave?"); 
        System.out.print("Enter A, B, or C: "); 
        String choice = input.nextLine().trim().toUpperCase(); 
 
        switch (choice) { 
            case "A": 
                System.out.println("\nClara freezes. Her hand trembles. No..."); 
                System.out.println("CLARA: You were never a monster. You were sick. You needed me."); 
                break; 
            case "B": 
                System.out.println("\nClara shakes her head."); 
                System.out.println("CLARA: You werent just a voice puppet. You were still my brother."); 
                break; 
            case "C": 
                graveNamed = true; 
                System.out.println("\nClara nods."); 
                System.out.println("CLARA: The boy who tried to forget. That is who you were."); 
                System.out.println("She carves a name—Elias Grey—softly, into the stone with a 
marker."); 
                break; 
            default: 
                System.out.println("\nClara cant decide. She sits silently by the grave, tears falling."); 
        } 
    } 
 
    public static void act6_conclusion() { 
        System.out.println("\nShe places the notebook on the grave. The wind whispers through the 
trees."); 
        System.out.println("\n>> The Lapati (V.O.): You are the one… <<"); 
 
        if (graveNamed) { 
            System.out.println("CLARA: Not anymore."); 
            System.out.println("She walks away, the weight a little lighter."); 
        } else { 
            System.out.println("She stays a little longer, still unsure if Elias ever truly saw her."); 
        } 
 
        System.out.println("\n--- THE END ---\n"); 
    } 
} 
 
 