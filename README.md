balenaOS builder example
============================================

This repository provides a Github Actions workflow to build balenaOS.

Customizing this project
========================

The projects defaults to using the `balena-os/balena-raspberrypi` device
repository and customizes it to build an initramfs image.

The project includes a `meta-balena-block` layer. This can be used to customize
the build output.

By default it contains a `balena-initramfs` image recipe.

