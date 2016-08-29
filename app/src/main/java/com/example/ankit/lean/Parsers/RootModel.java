import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String end_time;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String location_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String background_image;
	public String code_of_conduct;
	public String topic;
	public String logo;
	public String organizer_description;
	public CreatorModel _creator;
	public String description;
	public int id;
	public String organizer_name;
	public String schedule_published_on;
	public String state;
	public String type;
	public String start_time;
	public VersionModel _version;

	public RootModel(ArrayList<Social_linksModel> social_links, String name, String end_time, String timezone, Call_for_papersModel call_for_papers, String email, String location_name, CopyrightModel copyright, String privacy, String background_image, String code_of_conduct, String topic, String logo, String organizer_description, CreatorModel creator, String description, int id, String organizer_name, String schedule_published_on, String state, String type, String start_time, VersionModel version) {

		this.social_links = social_links;
		this.name = name;
		this.end_time = end_time;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.location_name = location_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.description = description;
		this.id = id;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.type = type;
		this.start_time = start_time;
		this._version = version;

	}

}