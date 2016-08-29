import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String description;
	public String end_time;
	public VersionModel _version;
	public String organizer_name;
	public String timezone;
	public String privacy;
	public String logo;
	public String location_name;
	public String state;
	public String start_time;
	public int id;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String topic;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String organizer_description;
	public String background_image;
	public CreatorModel _creator;
	public String email;

	public RootModel(String code_of_conduct, String description, String end_time, VersionModel version, String organizer_name, String timezone, String privacy, String logo, String location_name, String state, String start_time, int id, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String name, String topic, String type, Call_for_papersModel call_for_papers, String schedule_published_on, String organizer_description, String background_image, CreatorModel creator, String email) {

		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.end_time = end_time;
		this._version = version;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.logo = logo;
		this.location_name = location_name;
		this.state = state;
		this.start_time = start_time;
		this.id = id;
		this._copyright = copyright;
		this.social_links = social_links;
		this.name = name;
		this.topic = topic;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._creator = creator;
		this.email = email;

	}

}