import java.util.*;

//Mike + Dunn

//Thank you so, so much for doing this. I know you werent able to finish it but its so nice to have my script translated at least a bit. <3 Ill clean up the rest.

public class Pier {

	private int aBuff, aQuick, aTech, aHacking, aBookSmarts, aStreetSmarts, aDealing, aCool, aSneak, aDodge, aEyes,
			aCharm, aIntimidate, aLie, aHPmax;

	Pier(int aBuff, int aQuick, int aTech, int aHacking, int aBookSmarts, int aStreetSmarts, int aDealing, int aCool,
			int aSneak, int aDodge, int aEyes, int aCharm, int aIntimidate, int aLie, int aHPmax) {
		this.aBuff = aBuff;
		this.aQuick = aQuick;
		this.aTech = aTech;
		this.aHacking = aHacking;
		this.aBookSmarts = aBookSmarts;
		this.aStreetSmarts = aStreetSmarts;
		this.aDealing = aDealing;
		this.aCool = aCool;
		this.aHPmax = aHPmax;
		int aHP = aHPmax;

		boolean heatScope = false;
		boolean pastGuard = false;

		// Hacking Variables
		Hacking h1 = new Hacking();
		boolean jackedIn = true;
		int floor = 1;
		int type = 1;
		int delve = 0;

		int moves = 15 + aBuff;

		int aBookS = 0;
		int aStreetS = 0;
		String background = null;

		/*
		 * sts - street smarts; bos - book smarts; qck - quick; buf - buff; tech - tech;
		 * eyes - eyes; cool - cool; lck - luck; chrm - charm; ice - ICE; inl -
		 * intelligence; hst - history; hck - hack; corp - corporate; snk - sneak; laug
		 * - leg augment; haug - hand augment; remhk - remote hacking; str - strength
		 */
		CharacterAce ace = new CharacterAce(aBuff, aQuick, aTech, aHacking, aBookSmarts, aStreetSmarts, aEyes, aCool,
				aCharm, aSneak);
		List<String> inventory = new ArrayList<String>();
		Random rand = new Random();

		// START
		System.out.println(
				"Stepping onto the abandoned pier, you can't help but marvel at the tragedy of it all. You know this place used to be the beacon of family fun back when this piece of the coast was its own and not just part of West City. Supposedly DEi forced opperations to close as a part of their beautification initiative, called it an eyesore or something. Just so happened business boomed in the DEi and Calgati recreation centers after. So now all that stands here are the rotting frames of carnival games and the rusting one of a ferris wheel. Seems like it closing down hit the whole block pretty hard, since the mall and appartments nearby are also abandoned.");

		while (moves > 0 && aHP >= 1) {

			if (ace.bos > 8 || ace.tech > 8) {
				System.out.println(
						"Augger clinics tend to be in covered areas to protect from rain, might want to look at for with a roof.");
			}
			if (ace.bos > 10 || ace.tech > 10) {
				System.out.println(
						"Salt is notorious for screwing up cyberware, the clinic probably wouldn’t be anywhere near the sea with all the spray it's kicking up.");
			}
			if (ace.eyes > 5) {
				System.out.println(
						"Power is off right now, but the litter around here isn’t that wet. I’d bet this place was open recently.");
			}
			if (ace.eyes > 17) {
				System.out.println("The cameras in this area are active and possibly looking at you.");
			}
			if (ace.sts > 9) {
				System.out.println(
						"This pier has been falling out of popularity recently, whoever owns it probably only holds onto this for the property value. What a waste, but at least I know that means no ones living on it. Otherwise the landlord would have brought in a goliath to clear them out.");
			}
			if (ace.hst > 10) {
				System.out.println(
						"That abandoned mall over there is run by the L34Ders, they’ll probably shoot me on sight if I go in there, but they would also know this area very well.");
			}

			// ENTERING PIER SURFACE AREA

			Scanner ent = new Scanner(System.in);
			System.out.println(
					"You enter pier surface area. There are many objects you can interact with: telephone pole, old ferris wheel, carnival game, inactive security cameras, pier subsurface area, pier ruined apartments and abandoned mall. To see interaction options enter object's name.");

			String isu = "";

			while (isu != "return home") {
				System.out.println("Enter Interaction Point Name. Or enter [Return home]");
				isu = ent.nextLine();

				if (isu.equalsIgnoreCase("telephone pole") || isu.equalsIgnoreCase("pole")
						|| isu.equalsIgnoreCase("telephone")) {
					moves--;
					System.out.println("Power is running through this.");
					if (ace.hck > 8) {
						System.out.println("Jack in? [no / yes]");

						while (isu.equalsIgnoreCase("no") || isu.equalsIgnoreCase("yes")) {
							isu = ent.nextLine();
							if (isu.equalsIgnoreCase("no")) {
								System.out.println("You decided not to jack into the pole.");
							} else if (isu.equalsIgnoreCase("yes")) {
								moves--;
								System.out.println(
										"The pole is jacked. Power runs somewhere below the pier and the nearby abandoned hall.");

								// hacking sequence here
								System.out.println("You're in.");
								jackedIn = true;
								floor = 1;
								while (jackedIn) {
									System.out.println("Currently on floor " + floor + ". \nDIVE? [y/n]");
									isu = ent.nextLine();
									if (isu.equalsIgnoreCase("y")) {
										// Selecting Encounter
										int encounter = rand.nextInt(9) + floor;
										if (encounter <= 6) {
											System.out.println("No hostile entities on this floor.");
										} else if (encounter <= 10) {
											System.out.println(
													"BLACK ICE DETECTED. BEGINING ICEPICK. FAILURE WILL LIKELY RESULT IN AN OVERLOAD");
											if (type == 1) {
												delve = h1.FragCon(floor, aHacking);
											} else if (type == 2) {
												delve = h1.Overload(floor, aHacking);
											} else if (type == 3) {
												delve = h1.PasswordHunt(floor, aHacking);
											} else if (type == 4) {
												delve = h1.Calculate(floor, aHacking);
											}
											if (delve == 0) {
												System.out.println(
														"You feel the black ICE begin to seep into your system. The pain is overwhelming and you black out. Once you come to, its been a few hours and you're on the edge of a deadly immune response.");
												jackedIn = false;
												aHP = 0;
												moves = 0;
											}
										} else if (encounter >= 11) {
											// DAEMON fight
										} else if (encounter >= 15) {
											// Hostile Netrunner
										}

										type = rand.nextInt(4) + 1;
										if (type == 1) {
											delve = h1.FragCon(floor, aHacking);
										} else if (type == 2) {
											delve = h1.Overload(floor, aHacking);
										} else if (type == 3) {
											delve = h1.PasswordHunt(floor, aHacking);
										} else if (type == 4) {
											delve = h1.Calculate(floor, aHacking);
										}
										if (delve <= 0) {
											System.out.println("TRACE AT CRITICAL. EXIT NOW.");
											jackedIn = false;
										} else {
											floor += delve;
										}

									} else if (isu.equalsIgnoreCase("n")) {
										System.out.println("SCRUBBING TRACE... DISCONECTING...");
										jackedIn = false;
									}

								}
								// Netrun Rewards!
								if (floor >= 1) {
									System.out.println("On floor 2 your recognize the traces of a remote user.");
								}
								if (floor >= 5) {
									System.out.println(
											"Whever this user is they had access to high-quality gear and some sort of special access. It seems they were hunting Rhyz for something.");
								}
								if (floor >= 10) {
									System.out.println(
											"The signiture is tracable to an Calgati HQ in Angel City. The most common reference the remote netrunner used here was - interestingly enough - employee data. Empoloyee data on Rhyz.");
									if (ace.bos >= 5) {
										System.out.println(
												"Definitely Calgati, possibly even a highriser or even Abutens himself. What makes Rhyz so important? One other bit of information stands out to you: the phrase \"OUT OF THE NIGHT\"");
									}
									if (floor >= 15) {
										System.out.println(
												"Based on some audio snipets and flagged words by this other netrunner, it seems Rhyz was being tracked for connections to MageLan. One other bit of information stands out to you: the phrase \\\"OUT OF THE NIGHT\\\"");
									}

								}
							}
						}
					}
				} else if (isu.equalsIgnoreCase("old ferris wheel") || isu.equalsIgnoreCase("ferris wheel")
						|| isu.equalsIgnoreCase("wheel") || isu.equalsIgnoreCase("ferris")) {
					moves--;
					int car = 0;
					System.out.println("There are 24 cars in the ferris wheel. To climb to next one, enter 'climb'.");
					isu = ent.nextLine();
					while (isu.equalsIgnoreCase("climb") && car < 10) {
						{
							isu = ent.nextLine();
							car++;
							moves--;
							System.out.println("The car number " + car + " is empty.");
							isu = " ";
						}
						if (car == 10) {
							System.out.println(
									"Climbing the metal bars you pull youself into car number 10, and find youself standing over the body of a woman wearing some type of military gear. ");
							if (ace.sts > 8) {
								System.out.println(
										"Street Scavs would be hounding this corpse to loot the gear the second they smelled blood. And within minutes her boss should have sent a drone to collect the corpse and equipment before the scavs got to this. Something is stopping both those groups from retrieving her.");
							}
							if (ace.tech > 9) {
								System.out.println(
										"This is old ARIES gear. Whoever she is, she had connections to someone powerful and was hired to do something quietly. I might be able to get this off her and sell it for something good.\nYou take the gear. You don't have much use for it, but someone on the black market certainly does.");
								inventory.add("old ARIES gear");
							} else {
								System.out.println(
										"You're not entirely sure what to do here. Its uncomfortable standing over a dead body, so you climb back down the ferris wheel.");
							}
							if (ace.corp > 8) {
								System.out.println("She seems to be corporate of some sort. Probably DEi special ops.");
							}
							if (ace.corp > 14) {
								System.out.println(
										"Definitely DEi special ops, but corporate protocol only allows for deployment in other countries and even then there is either a partner or an armed escort that follows an agent. If there’s only one here and her gear hasn’t been recovered, then this is probably not an official operation.");
							}
						}
					}

				} else if (isu.equalsIgnoreCase("carnival game") || isu.equalsIgnoreCase("game")
						|| isu.equalsIgnoreCase("carnival")) {
					moves--;
					System.out.println(
							"You look around the carnival game on the edge of the pier. You can't make out what game used to be played here, since everything from prizes to the machinery used seems to have been stolen.");
					if (ace.eyes > 8) {
						System.out.println(
								"[EYES] oddly -and unervingly- you notice a toy gun laying on the ground that looters must not have been interested in. You pick it up, and realize from the weight that this is definitely not a toy.\n HANDGUN added to inventory");
						inventory.add("handgun");
					}

				} else if (isu.equalsIgnoreCase("security cameras") || isu.equalsIgnoreCase("cameras")
						|| isu.equalsIgnoreCase("camera")) {
					moves--;
					System.out.println(
							"The secrurity cameras are high up, you'll have to climb it somehow.\n Try to climb? [yes / no]");
					isu = ent.nextLine();

					if (isu.equalsIgnoreCase("yes")) {
						moves--;

						if (ace.buf > 7 || ace.qck > 7 || ace.laug || ace.remhk) {
							System.out.println(
									"You manage to climb up the rusty pins on the side of the pier's pillars and hop onto one that lets you reach the camera's port.\nJack in?");

							if (ent.nextLine() == "no") {
								System.out.println("You decided not to jack in.");
							} else if (ent.nextLine() == "yes") {
								moves--;
								if (ace.hck > 5) {
									System.out.println("Cameras are active and someone is using them.");
								}
								if (ace.hck > 10) {
									System.out.println(
											"Whoever is in this system with me knows what they’re doing. They’ve got a firewall already installed, so this must be a base of some sort.");
								}
								// hacking game
								System.out.println(
										"You slide your sinapsring from your arm into the port and brace youself for whatever malware some hooligans instaled for laughs, but none comes. You make your way deeper into its net... \nand deeper... \nand deeper...\n until finally you find the first floor of this net. ");
								System.out.println("You're in.");
								jackedIn = true;
								floor = 1;
								while (jackedIn) {
									System.out.println("Currently on floor " + floor + ". \nDIVE? [y/n]");
									isu = ent.nextLine();
									if (isu.equalsIgnoreCase("y")) {
										// Selecting Encounter
										int encounter = rand.nextInt(9) + floor;
										if (encounter <= 6) {
											System.out.println("No hostile entities on this floor.");
										} else if (encounter <= 10) {
											System.out.println(
													"BLACK ICE DETECTED. BEGINING ICEPICK. FAILURE WILL LIKELY RESULT IN AN OVERLOAD");
											if (type == 1) {
												delve = h1.FragCon(floor, aHacking);
											} else if (type == 2) {
												delve = h1.Overload(floor, aHacking);
											} else if (type == 3) {
												delve = h1.PasswordHunt(floor, aHacking);
											} else if (type == 4) {
												delve = h1.Calculate(floor, aHacking);
											}
											if (delve == 0) {
												System.out.println(
														"You feel the black ICE begin to seep into your system. The pain is overwhelming and you black out. Once you come to, its been a few hours and you're on the edge of a deadly immune response.");
												aHP = 0;
												moves = 0;
											}
										} else if (encounter >= 11) {
											// DAEMON fight
										} else if (encounter >= 15) {
											// Hostile Netrunner
										}

										type = rand.nextInt(4) + 1;
										if (type == 1) {
											delve = h1.FragCon(floor, aHacking);
										} else if (type == 2) {
											delve = h1.Overload(floor, aHacking);
										} else if (type == 3) {
											delve = h1.PasswordHunt(floor, aHacking);
										} else if (type == 4) {
											delve = h1.Calculate(floor, aHacking);
										}

										floor += delve;

									} else if (isu.equalsIgnoreCase("n")) {
										System.out.println("SCRUBBING TRACE... DISCONECTING...");
										jackedIn = false;
									}

								}
								// Netrun Rewards!
								if (floor >= 1) {
									System.out.println(
											"You collect files from floor 3: Seccurity records from an old system the owners must have forgotten to shut off. They indicate an individual passed through. Seemingly a corporate agent, she scouted the area for clues to something. She set up a snipers nest in the ferris wheel, but somehow a kill program hit her remotely. That cant be possible, right?");
								}
								if (floor >= 5) {
									System.out.println(
											"From floor 6 you manage to collect a recent message, seemingly left floating deep in this net for some reason. it reads: OUT OF THE NIGHT");
								}
								if (floor >= 10) {
									System.out.println(
											"An avatar appars before you just as you're disconnecting from the net.");
									if (ace.bos >= 10) {
										System.out.println(
												"And not just any avatar, if memory serves this is the form the user MORI used when she blew open corpo security across the country for the July 4th Raids. Someone must have stolen this avatar for cred, since she was pronounced dead from a kill program.");
									}
									System.out.println(
											"Talented, aren't you? Her voice reads. Its light and ephemeral, almost unnaturally so. Definitely a voice changer at work. You're seeking Rhyz, correct?");
									System.out.println("1. Yeah, who are you?\n2. None of your business.");
									isu = ent.nextLine();
									if (isu.equalsIgnoreCase("1")) {
										System.out.println("Look for room 122. OUT OF THE NIGHT will be your key.");
									} else {
										System.out.println("Very well. Just remember: OUT OF THE NIGHT.");
									}
									System.out.println(
											"and with that the avatar disapears and you go to exit the security net.");
								}
								if (floor >= 15) {
									System.out.println(
											"As you begin to leave the net, you realize something. That avatar was Mori. No, not just avatar. That signiture was MORI. the Mori who caused the independence day raids. the Mori thats presumed dead. How is she connected to Rhyz?!");
								}

							}

						}
					} else {
						System.out.println(
								"You try to pull yourself up, but arent strong or agile enough to make it to the synapstring port.");
					}
				} else if (isu.equalsIgnoreCase("pier subsurface area") || isu.equalsIgnoreCase("subsurface area")) {
					moves--;
					System.out.println(
							"You find a matinence door leading down below. It seems not only rusted shut, but maglocked somehow.");

				} else if (isu.equalsIgnoreCase("apartments") || isu.equalsIgnoreCase("pier ruined apartments")
						|| isu.equalsIgnoreCase("ruined apartments")) {
					moves--;
					if (ace.sts > 7) {
						System.out.println(
								"This place has been in use recently. Probably squatters in some of these rooms.");
					}
					if (ace.sts > 10) {
						System.out.println(
								"A place like this must be very popular among the street dwelling population here.");
					}
					if (ace.bos > 12) {
						System.out.println(
								"This place must have shut down around the same time as the mall, but with the way property values on the coast have been more people should be living here unless something is keeping them away.");
					}
					boolean inApartments = true;
					while (inApartments) {
						System.out.println("[(Room #)___, Front Desk, Exit]");
						isu = ent.nextLine();
						if (isu.equalsIgnoreCase("122") || isu.equalsIgnoreCase("Room 122")) {
							moves--;
							System.out.println(
									"this door has a keyboard on the floor with the wire running through the wall into the room");
							System.out.println("1. Kick down the door\n2. Jack in to the keybord\n3. Type on keyboard");
							isu = ent.nextLine();
							if (isu.equalsIgnoreCase("1")) {
								moves--;
								if (ace.buf > 12) {
									System.out.println(
											"The door opens. You may now travel directly to the clinic from your appartment by typing \"CLINIC\"");

									// END SCENE! RETURN SUCCESS! MOVE ON TO RHYZ CLINIC!
									Clinic clinic = new Clinic(aBuff, aQuick, aTech, aHacking, aBookSmarts,
											aStreetSmarts, aDealing, aCool, aSneak, aDodge, aEyes, aCharm, aIntimidate,
											aLie, aHPmax, background);

								}
							} else if (isu.equalsIgnoreCase("2")) {
								jackedIn = true;
								floor = 1;
								while (jackedIn) {
									System.out.println("Currently on floor " + floor + ". \nDIVE? [y/n]");
									isu = ent.nextLine();
									if (isu.equalsIgnoreCase("y")) {
										// Selecting Encounter
										int encounter = rand.nextInt(9) + floor;
										if (encounter <= 8) {
											System.out.println("No hostile entities on this floor.");
										} else if (encounter <= 20) {
											System.out.println(
													"BLACK ICE DETECTED. BEGINING ICEPICK. FAILURE WILL LIKELY RESULT IN AN OVERLOAD");
											if (type == 1) {
												delve = h1.FragCon(floor, aHacking);
											} else if (type == 2) {
												delve = h1.Overload(floor, aHacking);
											} else if (type == 3) {
												delve = h1.PasswordHunt(floor, aHacking);
											} else if (type == 4) {
												delve = h1.Calculate(floor, aHacking);
											}
											if (delve == 0) {
												System.out.println(
														"You feel the black ICE begin to seep into your system. The pain is overwhelming and you black out. Once you come to, its been a few hours and you're on the edge of a deadly immune response.");
												jackedIn = false;
												aHP = 0;
												moves = 1;
											}
										} else if (encounter >= 11) {
											// DAEMON fight
										} else if (encounter >= 15) {
											// Hostile Netrunner
										}

										type = rand.nextInt(4) + 1;
										if (type == 1) {
											delve = h1.FragCon(floor, aHacking);
										} else if (type == 2) {
											delve = h1.Overload(floor, aHacking);
										} else if (type == 3) {
											delve = h1.PasswordHunt(floor, aHacking);
										} else if (type == 4) {
											delve = h1.Calculate(floor, aHacking);
										}
										if (delve <= 0) {
											System.out.println(
													"TRACE AT CRITICAL. EXIT NOW BEFORE DAMAGE BECOMES MORE SEVERE.");
											aHP -= 5;
											jackedIn = false;
										} else {
											floor += delve;
										}
									} else if (isu.equalsIgnoreCase("n")) {
										System.out.println("SCRUBBING TRACE... DISCONECTING...");
										jackedIn = false;
									}

								}
								// Netrun Rewards!
								if (floor >= 5) {
									System.out.println(
											"The door opens. You may now travel directly to the clinic from your appartment by typing \"CLINIC\"");

									// UNLOCK RHYZ CLINIC AS TRAVEL LOCATION
									Clinic clinic = new Clinic(aBuff, aQuick, aTech, aHacking, aBookSmarts,
											aStreetSmarts, aDealing, aCool, aSneak, aDodge, aEyes, aCharm, aIntimidate,
											aLie, aHPmax, background);
									// END SCENE! RETURN SUCCESS! MOVE ON TO RHYZ CLINIC!

								}

							} else if (isu.equalsIgnoreCase("3")) {
								moves--;
								System.out.println("What do you type?");
								isu = ent.nextLine();
								if (isu.equalsIgnoreCase("out of the night")) {

									System.out.println(
											"The door opens. You may now travel directly to the clinic from your appartment by typing \"CLINIC\"");

									// END SCENE! RETURN SUCCESS! MOVE ON TO RHYZ CLINIC!
									Clinic clinic = new Clinic(aBuff, aQuick, aTech, aHacking, aBookSmarts,
											aStreetSmarts, aDealing, aCool, aSneak, aDodge, aEyes, aCharm, aIntimidate,
											aLie, aHPmax, background);

								}
							}

						} else if (isu.equalsIgnoreCase("Front Desk")) {
							moves--;
							System.out.println("The only key missing is number 404");
							if (ace.eyes > 17) {
								System.out.println(
										"It seems like numbers 120, 121, 122, 123, and 124 have been glued in place.");
							}
						} else if (isu.equalsIgnoreCase("404")) {
							System.out.println("Room not found.");
						} else if (isu.equalsIgnoreCase("exit")) {
							moves--;
							inApartments = false;
						} else {
							System.out.println("This room has been abandoned for ages");
							moves--;
						}
					}
				}

				else if (isu.equalsIgnoreCase("mall") || isu.equalsIgnoreCase("abandoned mall")) {
					moves--;
					System.out.println(
							"A gang has set up here, seemingly L34Ders. There's the sound of a patrol somewhere in the halls. Seems their base is in the food court.");
					if (ace.eyes > 8) {
						System.out.println(
								"They have a lot of surveillance equipment, might be they have some data of Rhyz.");
					}
					if (ace.eyes > 12 || ace.tech > 8) {
						System.out.println(
								"Their equipment is hooked into the local net, I saw a port outside I can use");
					}
					if (ace.snk > 9) {
						System.out.println(
								"Staying to the shadows as you move, you’re fortunate to realize that there’s a well armed individual walking the halls on patrol who hasn’t noticed you yet.\nYou can [distract] them, [sneak] or [talk] to them.");

						isu = ent.nextLine();

						if (isu == "distract") {
							moves--;
							System.out
									.println("[Play] the sound of police sirens or [Trip] the motion-activated door?");

							isu = ent.nextLine();

							if (isu == "Play") {
								moves--;
								System.out.println(
										"You pull out the speaker and play the sound of police sirens approaching. Your audio craft is masterful. Unfortunately, playing it from a speaker you're currently holding has revealed you to the patrolman, who opens fire.");
								// combat begins
							}
							if (isu == "Trip") {
								moves--;
								System.out.println(
										"You send a few pulses of light at the sensor of the motion-activated door. It slides open and shut a few times, getting the attention of the patrolman while you sneak by");
								pastGuard = true;
							}
						}
						if (isu == "talk") {
							moves--;
							System.out.println(
									"You try to get a greeting out but the guard is too jumpy to let you say another word once he sees your face in his territory.");
							if (ace.qck > 8) {
								System.out.println(
										"[Quick] Fortunately, you manage to flee before the guard opens fire.");
							} else {
								System.out.println(
										"Combat begins. Combat machine broke so lets just say you win. Just keep this broken part of the game between us, ok? great. Here, ill give you some extra moves if you keep quiet about this...");
								System.out.println("+ 10 Moves");
								moves += 10;
								// combat
								pastGuard = true;
							}

						}
						System.out.println(
								"Past the guard's patrol, you make your way to the piles of tech the L34Ds have been using. Theres a local net theyve been linking everything to that you could maybe get into.");

						if (ace.remhk || inventory.contains("saw") || pastGuard == true) {
							System.out.println("You jack in.");
							moves--;
							jackedIn = true;
							floor = 1;
							while (jackedIn) {
								System.out.println("Currently on floor " + floor + ". \nDIVE? [y/n]");
								isu = ent.nextLine();
								if (isu.equalsIgnoreCase("y")) {
									// Selecting Encounter
									int encounter = rand.nextInt(9) + floor;
									if (encounter <= 8) {
										System.out.println("No hostile entities on this floor.");
									} else if (encounter <= 20) {
										System.out.println(
												"BLACK ICE DETECTED. BEGINING ICEPICK. FAILURE WILL LIKELY RESULT IN AN OVERLOAD");
										if (type == 1) {
											delve = h1.FragCon(floor, aHacking);
										} else if (type == 2) {
											delve = h1.Overload(floor, aHacking);
										} else if (type == 3) {
											delve = h1.PasswordHunt(floor, aHacking);
										} else if (type == 4) {
											delve = h1.Calculate(floor, aHacking);
										}
										if (delve == 0) {
											System.out.println(
													"You feel the black ICE begin to seep into your system. The pain is overwhelming and you black out. Once you come to, its been a few hours and you're on the edge of a deadly immune response.");
											jackedIn = false;
											aHP = 0;
											moves = 1;
										}
									} else if (encounter >= 11) {
										// DAEMON fight
									} else if (encounter >= 15) {
										// Hostile Netrunner
									}

									type = rand.nextInt(4) + 1;
									if (type == 1) {
										delve = h1.FragCon(floor, aHacking);
									} else if (type == 2) {
										delve = h1.Overload(floor, aHacking);
									} else if (type == 3) {
										delve = h1.PasswordHunt(floor, aHacking);
									} else if (type == 4) {
										delve = h1.Calculate(floor, aHacking);
									}
									if (delve <= 0) {
										System.out.println(
												"TRACE AT CRITICAL. EXIT NOW BEFORE DAMAGE BECOMES MORE SEVERE.");
										aHP -= 5;
										jackedIn = false;
									} else {
										floor += delve;
									}
								} else if (isu.equalsIgnoreCase("n")) {
									System.out.println("SCRUBBING TRACE... DISCONECTING...");
									jackedIn = false;
								}

							}

							// Netrun rewards
							if (floor >= 4) {
								System.out.println(
										"Security camera records indicate Rhyz is somewhere on the first floor between room 110 and 123");
							}
							if (floor >= 8) {
								System.out.println(
										"The L34Ds have been contracted by someone, seemingly by the name of Abutens.");
								if (ace.bos >= 8) {
									System.out.println(
											"Abutens is the name of the CEO of Calgati. Why does he have an interest in Rhyz? And why did he atatch this note for the L34Ds saying \"Password likely is: OUT OF THE NIGHT\"");
								}
							}
							if (floor >= 12) {
								System.out.println(
										"It seems based on the notes of the L34D stalkers that Rhyz is connected to Magelan somehow.");
							}

							System.out.println(
									"\n \nThe patrol is still circling, staying too long is likely to get you caught.\n [rig detonation, play sirens, sneak out, run]");
							isu = ent.nextLine();

							if (isu.equalsIgnoreCase("rig detonation") || isu.equalsIgnoreCase("detonation")) {
								moves--;
								if (ace.tech > 6) {
									System.out.println(
											"You rig the L34D's router to explode as a distraction. You move to a safe distance and let the explosion happen, then run the other way as you hear footseps approaching.");
								} else {
									System.out.println(
											"you can't figure out where the volatile components are hooked in the net, so rigging this isn't going to work.");
								}
							} else if (isu.equalsIgnoreCase("play sirens") || isu.equalsIgnoreCase("sirens")) {
								moves--;
								if (ace.hck > 10) {
									System.out.println("You play police sirens in the mall.");
								} else {
									System.out.println(
											"Whoever put this net together created such a mess you're not sure if its even connected to speakers, much less where the imput for them is.");
								}
							} else if (isu.equalsIgnoreCase("sneak out") || isu.equalsIgnoreCase("sneak")) {
								moves--;
								if (ace.snk > 10) {
									System.out.println("You sneak out.");
								} else {
									System.out.println("You were noticed");
									// begin combat
								}
							} else if (isu.equalsIgnoreCase("run") || isu.equalsIgnoreCase("run out")) {
								moves--;
								if (ace.qck >= 10) {
									System.out.println("You successfully ran out of the mall.");
								} else {
									System.out.println("You were noticed");
									System.out.println(
											"Combat begins. Combat machine broke so lets just say you win. Just keep this broken part of the game between us, ok? great. Here, ill give you some extra moves if you keep quiet about this...");
									System.out.println("+ 10 Moves");
									// begin combat
								}
							}

						}
					}
				}
			}
		}
		System.out.println(
				"Your body trembles as your immune system begins to act up after a day of work. You try to disociate and avoid exasperating the attack as you make your way home.");

	}
}
