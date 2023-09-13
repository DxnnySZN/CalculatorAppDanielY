# Material Theme Builder Android Export

## Basics

This archive contains a number of files defining a Material 3 theme:

 * values/colors.xml        - contains all colors used by your theme
 * values/theme.xml         - assigns those colors to roles in the light theme
 * values-night/theme.xml   - assigns those colors to roles in the dark theme

In your project, you can copy the two directories to /app/src/main/res/.
Please note that in Android Studio, the Android project view groups theme.xml files
appearing to indicate there is an additional subdirectory. Either switch to the

Project view or copy the files over in Finder/File Explorer.## Extended Color

Each custom color adds a number of entries to the generated themes. An attrs.xml file
is created for you containing an entry for the four color roles for each custom color
and a field to indicate if the color is harmonized or not.

  * \<color>
  * on\<color>
  * \<color>Container
  * on\<color>Container
  * harmonize\<color>

where \<color> is your custom color name.

For more information, check out our codelab on Color Harmonization in Android Views,
[https://codelabs.developers.google.com/harmonize-color-android-views?hl=en#2](https://codelabs.developers.google.com/harmonize-color-android-views?hl=en#2).
