package com.music.shoplist.domain

class DeleteShopItemUseCade(private val shopListRepisitory: ShopListRepisitory) {

    fun deleteItem (shopItem: ShopItem){
       shopListRepisitory.deleteItem(shopItem)
    }
}