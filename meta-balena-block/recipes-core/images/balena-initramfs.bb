# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Barebone initramfs image."
LICENSE = "MIT"

inherit image

PACKAGE_INSTALL = " \
    base-files \
    base-passwd \
    busybox \
    ${ROOTFS_BOOTSTRAP_INSTALL} \
"
IMAGE_LINGUAS = " "
IMAGE_FEATURES = ""
export IMAGE_BASENAME = "balena-initramfs"
IMAGE_FSTYPES = "${INITRAMFS_FSTYPES} ${INITRAMFS_FSTYPES}.u-boot"
IMAGE_ROOTFS_SIZE = "8192"
