# GDHijack

Automatically compiles (builds) mods through the Asset Manager for Grim Dawn.

## Disclaimer

I am NOT liable for any damage you cause to your mods or your computer with this code.

This code was written for a 1920x1080 monitor at 100% magnification (standard) on Windows 7. Timings were made for read operations from a Solid State Drive; if you're using a Hard Disk Drive, you may need to adjust the Robot delay and Thread sleep times accordingly.

-Ceno

## Usage

Edit the "int[] mods = {5, 6};" line (line 11) in Main.java to an array of whichever mods you want to automatically compile via the Asset Manager. There's probably a limit to the highest mod ID, but I don't have any clue what it is. Should work up to about 40 at least. A mod ID in this program is defined as its placement on the Mod->Select dropdown menu, with 0 being None, 1 being immediately after None, etc. 

Then run the code however you like to run Java code. Make sure you don't have any Asset Managers presently running/building.

Am I making a UI for this? Hellno.

Video demonstration: https://youtu.be/XLqRkO6K7wo

Oh if the Asset Manager wants to ask you about removing unallocated resources or whatever, this program can't handle that. It won't crash and it will compile whatever mods it has left, but it won't initiate the compilation of the mod in question. I'm thinking about how to handle that.
