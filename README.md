# meta-webinar

This layer provides useful exemplifications featured in a webinar presented at the Seminario Linux Embarcado 2023 (2023 Embedded Linux Seminar) hosted by [Portal Embarcados](https://embarcados.com.br/).

Dependencies
============

This layer depends on the Toradex BSP Layers and some third-party ones. You can download them using the Toradex manifest:

- **URI**: `git://git.toradex.com/toradex-manifest.git`
- **Branch**: `kirkstone-6.x.y`


Adding the webinar layer to your build
=================================================

In order to use this layer, you need to include it in your `bblayers.conf` file, as shown below:

BBLAYERS ?= " \
  ${BBLAYERS_NXP} \
  ${BBLAYERS_TI} \
  \
  ${TOPDIR}/../layers/meta-toradex-bsp-common \
  \
  ${TOPDIR}/../layers/meta-openembedded/meta-oe \
  ${TOPDIR}/../layers/meta-openembedded/meta-filesystems \
  ${TOPDIR}/../layers/meta-openembedded/meta-gnome \
  ${TOPDIR}/../layers/meta-openembedded/meta-xfce \
  ${TOPDIR}/../layers/meta-openembedded/meta-networking \
  ${TOPDIR}/../layers/meta-openembedded/meta-multimedia \
  ${TOPDIR}/../layers/meta-openembedded/meta-python \
  ${TOPDIR}/../layers/meta-freescale-distro \
  ${TOPDIR}/../layers/meta-toradex-demos \
  ${TOPDIR}/../layers/meta-qt5 \
  \
  \
  ${TOPDIR}/../layers/meta-toradex-distro \
  ${TOPDIR}/../layers/meta-yocto/meta-poky \
  ${TOPDIR}/../layers/openembedded-core/meta \
  ${TOPDIR}/../layers/meta-webinar \
"


Information
========

The primary goal of developing this layer is to provide a demonstration of applying patches to the Linux kernel using the Yocto Project. In this specific case, we utilize a Colibri i.MX6ULL with an Aster evaluation board.

Linux kernel modifications have been implemented to enable INA219 as a hwmon device and DS3231 as the primary system RTC. Additionally, a web application (hwmon-web) has been included to visually showcase the kernel modifications to participants of the webinar.
