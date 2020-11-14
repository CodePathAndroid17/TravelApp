# Unit 8 Submission

Original App Design Project
===

# Battuta

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
Battuta is an app that makes use of API in order to help users plan out their future travels. Users are able to explore a variety of options at varying levels of cost in order to select ideal options for transportation and lodging. They are then able to view overall information about their trips in order to help their dreams become a reality.


### App Evaluation
- **Category:** Travel

- **Mobile:** This app would be primarily developed for mobile usage, but would be just as viable on a computer. An app would be an ideal implementation of our idea because it would be an easy and portable way to access information. This is especially applicable for our app since it is for travel and our market includes customer who are on the move. Our app would also be able to make use of location, map, and real-time information.

- **Story:** This app is meant to attract users that have the urge to travel and really want to see the world. With this app, they will be empowered to design an affordable trip. The value is mainly for those that long to travel, but are curious to see how much their trip would cost. This app would be well received by others as many people have the urge to travel, but are concerned about how much it would cost. Being able to plan out their future trips in the app would help make them feasible.

- **Market:** The primary market for our app are those that are interested in travel. This would include those who are looking to plan future trips. Individuals would be able to plan their trips ahead of time by using our app to help decide which hotels to book, which plane tickets to buy, etc. Our app would also help individuals plan our their finances for their trips as they can see prices for a variety of options. Since our app is travel related, our market would be quite large as many people travel at some point in their lives. We would also be involved with expansive industries such as tourism and transportation.

- **Habit:** This app is used most often by users when they are in the process of planning for trips. They may even use the app during trips in order to access specific transportation and lodging information. However, after their trip, users may not open the app as often until they decide to plan their next one. With its ease of use, this app will allow users to easily plan as many trips as they like to their hearts content. They will also be able to track their progress until their trip becomes a reality. The average user would be creating in the app as they are planning out their travels.

- **Scope:** Right now, the scope of the app is very clear as it is focused on users being able to choose transportation and lodging for their trips and see a cost analysis. We could chose to expand the scope by having more content in our app related to tourist locations and more visual content of locations to travel to. There could be also more tools for planning trips like an itinerary and a budgeting tracker. The most technically involved portions of this app will include acquiring the data for transportation and lodging through APIs. The other portions of the app will be more focused on making a simple, clean design. Right now, the app is set to meet the requirements for a minimal viable product, so its components are stripped down the the core of what is needed. However, there is a lot of room for additional features to be implemented if time and resources permit.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**
* Able to search for locations to travel to
* Able to search for transportation options
* Able to search for lodging options
* Able to detect user's current location (may need to set up permissions)
* Buttons should be able to move users to correct screens and options
* The costs of transportation and lodging should be totaled for the cost analysis
* More detailed information should be correctly displayed for the transportation and lodging options
* Data for the app user is able to be persisted between them opening and closing the app

**Optional Nice-to-have Stories**
* User has an account and is able to log in to see their information and trips
* User has a profile page
* Additional filtering options for the transportation and lodging search
* Nearest location for transportation is able to be computed for the user's current location
* Option for "sub-destinations" on trips, meaning that traveling within a trip can be planned in more detail
* More detailed information on the cost of the trips (budgeting, seeing how much needs to be saved up, miscellaneous costs during the trip such as for eating, etc.)

### 2. Screen Archetypes

* Onboarding/Welcome screen
   * Appears when the app is first opened
* Home (What would you like to do?)
   * Allows a user to choose to either "Plan a trip" or "Edit a trip"
* Pick a destination
   * Both search boxes should allow for the search of a specific location
   * "Use current location" button should automatically input the user's current location into the "From Where?" field
* Pick your transportation
   * Should show list of different transportation options
* Pick your lodging
   * Should show list of different lodging options
* Trip list
   * Should show list of all the trips that the user has inputted
   * Should allow for selection of a specific trip in order to see its details
* Trip details
   * General details of trip should be shown
   * Should allow user to edit the destination, transportation, or lodging of the trip

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* N/A for our Minimal Viable Product

**Flow Navigation** (Screen to Screen)

* Onboarding/Welcome screen
   * Home (What would you like to do?)
       * Plan a trip
           * Pick a destination
           * Pick your transportation
           * Pick your lodging
           * Trip list
           * Home
       * Edit a trip
           * Trip list
           * Trip details
               * Edit destination
                   * Trip details
               * Edit transportation
                   * Trip details
               * Edit Lodging
                   * Trip details
           * Home

### Digital Wireframes & Mockups
<img src="https://github.com/CodePathAndroid17/TravelApp/raw/main/BattutaWireframe.png" width=600>

### Interactive Prototype
<img src="https://github.com/CodePathAndroid17/TravelApp/raw/main/Battuta1.gif" width=200><br>

<img src="https://github.com/CodePathAndroid17/TravelApp/raw/main/Battuta2.gif" width=200>

## Schema 
[This section will be completed in Unit 9]
### Models
[Add table of models]
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
