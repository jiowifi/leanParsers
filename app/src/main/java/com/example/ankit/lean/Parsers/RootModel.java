import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String logo;
	public String privacy;
	public String schedule_published_on;
	public String name;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String start_time;
	public String description;
	public String end_time;
	public String background_image;
	public String type;
	public String organizer_description;
	public int id;
	public String email;
	public String code_of_conduct;
	public String timezone;
	public String state;
	public String location_name;

	public RootModel(ArrayList<Social_linksModel> social_links, CreatorModel creator, CopyrightModel copyright, VersionModel version, String logo, String privacy, String schedule_published_on, String name, String organizer_name, Call_for_papersModel call_for_papers, String topic, String start_time, String description, String end_time, String background_image, String type, String organizer_description, int id, String email, String code_of_conduct, String timezone, String state, String location_name) {

		this.social_links = social_links;
		this._creator = creator;
		this._copyright = copyright;
		this._version = version;
		this.logo = logo;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.start_time = start_time;
		this.description = description;
		this.end_time = end_time;
		this.background_image = background_image;
		this.type = type;
		this.organizer_description = organizer_description;
		this.id = id;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.state = state;
		this.location_name = location_name;

	}

}