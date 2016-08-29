import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String topic;
	public VersionModel _version;
	public String organizer_name;
	public CreatorModel _creator;
	public String start_time;
	public String location_name;
	public int id;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String description;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String end_time;
	public String timezone;
	public String organizer_description;
	public String code_of_conduct;
	public String state;
	public String email;

	public RootModel(String background_image, String topic, VersionModel version, String organizer_name, CreatorModel creator, String start_time, String location_name, int id, CopyrightModel copyright, String schedule_published_on, String logo, Call_for_papersModel call_for_papers, String privacy, String description, String name, ArrayList<Social_linksModel> social_links, String type, String end_time, String timezone, String organizer_description, String code_of_conduct, String state, String email) {

		this.background_image = background_image;
		this.topic = topic;
		this._version = version;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.start_time = start_time;
		this.location_name = location_name;
		this.id = id;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.description = description;
		this.name = name;
		this.social_links = social_links;
		this.type = type;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.email = email;

	}

}