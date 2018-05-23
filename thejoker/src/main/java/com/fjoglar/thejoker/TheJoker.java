/*
 * Copyright 2018 Felipe Joglar Santos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fjoglar.thejoker;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This class is used to select a joke from an array of jokes. And return it to the
 * caller.
 * The jokes were taken from:
 * https://www.techrepublic.com/article/the-geekiest-tech-jokes-on-the-internet/
 */
public class TheJoker {

    private String[] mJokes;

    public TheJoker() {

        mJokes = new String[20];
        mJokes[0] = "There are 10 types of people in the world: those who understand binary, and those who don't.";
        mJokes[1] = "How many programmers does it take to change a light bulb?\nNone. It's a hardware problem.";
        mJokes[2] = "A SEO couple had twins. For the first time they were happy with duplicate content.";
        mJokes[3] = "Why is it that programmers always confuse Halloween with Christmas?\nBecause 31 OCT = 25 DEC.";
        mJokes[4] = "Why do they call it hyper text?\nToo much JAVA.";
        mJokes[5] = "Why was the JavaScript developer sad?\nBecause he didn't Node how to Express himself.";
        mJokes[6] = "In order to understand recursion you must first understand recursion.";
        mJokes[7] = "Why do Java developers wear glasses? Because they can't C#";
        mJokes[8] = "What do you call 8 hobbits?\nA hobbyte.";
        mJokes[9] = "Why did the developer go broke?\nBecause he used up all his cache.";
        mJokes[10] = "Why did the geek add body { padding-top: 1000px; } to his Facebook profile?\nHe wanted to keep a low profile.";
        mJokes[11] = "An SEO expert walks into a bar, bars, pub, tavern, public house, Irish pub, drinks, beer, alcohol.";
        mJokes[12] = "I would tell you a UDP joke, but you might not get it.";
        mJokes[13] = "8 bytes walk into a bar, the bartenders asks \"What will it be?\"\nOne of them says, \"Make us a double.\"";
        mJokes[14] = "Two bytes meet. The first byte asks, \"Are you ill?\"\nThe second byte replies, \"No, just feeling a bit off.\"";
        mJokes[15] = "These two strings walk into a bar and sit down. The bartender says, \"So what'll it be?\"\n" +
                "The first string says, \"I think I'll have a beer quag fulk boorg jdk^CjfdLk jk3s d#f67howe%^U r89nvy~~owmc63^Dz x.xvcu\"\n" +
                "\"Please excuse my friend,\" the second string says, \"He isn't null-terminated.\"";
        mJokes[16] = "\"Knock, knock. Who's there?\"\nvery long pause...\n\"Java.\"";
        mJokes[17] = "If you put a million monkeys on a million keyboards, one of them will eventually write a Java program. The rest of them will write Perl programs.";
        mJokes[18] = "There's a band called 1023MB. They haven't had any gigs yet.";
        mJokes[19] = "There are only two hard things in computer science: cache invalidation, naming things, and off-by-one errors.";
    }

    /**
     * Get a joke.
     *
     * @return a random joke
     */
    public String getJoke() {
        return mJokes[ThreadLocalRandom.current().nextInt(mJokes.length)];
    }
}
