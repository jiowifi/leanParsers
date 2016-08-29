import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String background_image;
	public String code_of_conduct;
	public String topic;
	public String end_time;
	public String logo;
	public String name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String type;
	public String schedule_published_on;
	public String privacy;
	public CreatorModel _creator;
	public String start_time;
	public String email;
	public String timezone;
	public int id;
	public String description;
	public String state;
	public CopyrightModel _copyright;
	public VersionModel _version;

	public RootModel(Call_for_papersModel call_for_papers, String organizer_name, String background_image, String code_of_conduct, String topic, String end_time, String logo, String name, String organizer_description, ArrayList<Social_linksModel> social_links, String location_name, String type, String schedule_published_on, String privacy, CreatorModel creator, String start_time, String email, String timezone, int id, String description, String state, CopyrightModel copyright, VersionModel version) {

		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.end_time = end_time;
		this.logo = logo;
		this.name = name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.location_name = location_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._creator = creator;
		this.start_time = start_time;
		this.email = email;
		this.timezone = timezone;
		this.id = id;
		this.description = description;
		this.state = state;
		this._copyright = copyright;
		this._version = version;

	}

}