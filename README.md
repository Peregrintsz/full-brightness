<p align="center">
  <img src="assets/icon.png" alt="Full Brightness logo" width="160" height="160">
</p>

<h1 align="center">Full Brightness</h1>

<p align="center">
  Turn the lights on, everywhere. One key, maximum brightness.
</p>

<p align="center">
  <img alt="Minecraft" src="https://img.shields.io/badge/Minecraft-26.2-3a7d44?style=flat-square">
  <img alt="License" src="https://github.com/Peregrintsz/full-brightness/blob/master/LICENSE">
  <img alt="Release" src="https://github.com/Peregrintsz/full-brightness/releases">
</p>

<p align="center">
  <a href="https://modrinth.com/mod/full-brightness"><b>Modrinth</b></a>
  &nbsp;•&nbsp;
  <a href="https://github.com/peregrintsz/full-brightness/releases"><b>Releases</b></a>
  &nbsp;•&nbsp;
  <a href="https://github.com/peregrintsz/full-brightness/issues"><b>Report a bug</b></a>
</p>

---

## What it does

Full Brightness is a small client-side Fabric mod that makes the world fully lit, so caves, nights and the Nether are as easy to see as a sunny day. Press a key to turn it on, press it again to go back to your normal brightness.

- **One key toggle.** Default key is `G`.
- **Remembers your setting.** Your previous brightness is restored when you switch it off and when you close the game.
- **Client-side only.** Nothing to install on a server, and it does not change any game data.

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/) for Minecraft **26.2**.
2. Download [Fabric API](https://modrinth.com/mod/fabric-api) and put it in your `mods` folder.
3. Download Full Brightness from [Modrinth](https://modrinth.com/mod/full-brightness) or the [Releases](https://github.com/peregrintsz/full-brightness/releases) page and put the `.jar` in the same `mods` folder.
4. Start the game.

## Usage

| Action | Key |
| --- | --- |
| Toggle Full Brightness | `G` (default) |

You can change the key in **Options → Controls → Key Binds**, under the *Full Brightness* category.

## Compatibility

- Minecraft **26.2**, Fabric Loader, Fabric API.
- Other mods that change brightness or lighting may conflict with this one. If something looks wrong, try removing the other mod first, then open an issue.

## Building from source

You need JDK 25.

```bash
git clone https://github.com/peregrintsz/full-brightness.git
cd full-brightness
./gradlew build
```

The finished jar is in `build/libs/`. To test in a development client:

```bash
./gradlew runClient
```

On Windows use `gradlew.bat` instead of `./gradlew`.

## Contributing

Bug reports and pull requests are welcome. For a bug report, please include your Minecraft version, Fabric Loader version, the other mods you use, and the `latest.log` file if the game crashed.

## License

This project is licensed under the terms in the [LICENSE](LICENSE) file.
