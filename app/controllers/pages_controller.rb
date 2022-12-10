class PagesController < ApplicationController
  def contact
  end

  def about
  end

  def home
    @books = Book.all
  end
end
