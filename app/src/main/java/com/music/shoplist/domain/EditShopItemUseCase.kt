package com.music.shoplist.domain

class EditShopItemUseCase(private val shopListRepisitory: ShopListRepisitory) {
    fun editShopItem(shopItem: ShopItem?){
       shopListRepisitory.editShopItem(shopItem)
    }
}