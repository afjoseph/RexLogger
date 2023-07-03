# RexLogger

Inject logs to an app.

# Usage

- Make a directory called `rex` in the `smali` directory on the decompiled app.
- Put `RexLogger.smali` in the newly created `rex` directory.
- Look up the smali reference for each function you wanna call in `RexLogger.java`. 

# Building

`just build` re-generates a `RexLogger.smali`
