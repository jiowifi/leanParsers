import java.util.ArrayList;

class RootModel {

	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String timezone;
	public VersionModel _version;
	public String logo;
	public String description;
	public String organizer_description;
	public String topic;
	public String email;
	public String name;
	public String background_image;
	public String type;
	public String code_of_conduct;
	public int id;
	public String privacy;
	public String state;
	public String schedule_published_on;
	public String start_time;
	public CreatorModel _creator;
	public String end_time;

	public RootModel(String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String organizer_name, CopyrightModel copyright, String timezone, VersionModel version, String logo, String description, String organizer_description, String topic, String email, String name, String background_image, String type, String code_of_conduct, int id, String privacy, String state, String schedule_published_on, String start_time, CreatorModel creator, String end_time) {

		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.timezone = timezone;
		this._version = version;
		this.logo = logo;
		this.description = description;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.email = email;
		this.name = name;
		this.background_image = background_image;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.privacy = privacy;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._creator = creator;
		this.end_time = end_time;

	}

}