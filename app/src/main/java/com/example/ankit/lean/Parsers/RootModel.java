import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String topic;
	public String end_time;
	public String logo;
	public int id;
	public String type;
	public String organizer_name;
	public String privacy;
	public String state;
	public VersionModel _version;
	public String timezone;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CopyrightModel _copyright;
	public String email;
	public String name;
	public String background_image;
	public String organizer_description;
	public String description;
	public String code_of_conduct;
	public String start_time;

	public RootModel(ArrayList<Social_linksModel> social_links, String schedule_published_on, String topic, String end_time, String logo, int id, String type, String organizer_name, String privacy, String state, VersionModel version, String timezone, CreatorModel creator, Call_for_papersModel call_for_papers, String location_name, CopyrightModel copyright, String email, String name, String background_image, String organizer_description, String description, String code_of_conduct, String start_time) {

		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.end_time = end_time;
		this.logo = logo;
		this.id = id;
		this.type = type;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.state = state;
		this._version = version;
		this.timezone = timezone;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._copyright = copyright;
		this.email = email;
		this.name = name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;

	}

}