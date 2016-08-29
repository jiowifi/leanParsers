import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String description;
	public String organizer_name;
	public CreatorModel _creator;
	public String timezone;
	public String email;
	public String end_time;
	public String schedule_published_on;
	public String type;
	public CopyrightModel _copyright;
	public String state;
	public String topic;
	public String name;
	public String organizer_description;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public int id;
	public String logo;
	public String privacy;
	public VersionModel _version;

	public RootModel(String start_time, String description, String organizer_name, CreatorModel creator, String timezone, String email, String end_time, String schedule_published_on, String type, CopyrightModel copyright, String state, String topic, String name, String organizer_description, String location_name, Call_for_papersModel call_for_papers, String code_of_conduct, ArrayList<Social_linksModel> social_links, String background_image, int id, String logo, String privacy, VersionModel version) {

		this.start_time = start_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.timezone = timezone;
		this.email = email;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._copyright = copyright;
		this.state = state;
		this.topic = topic;
		this.name = name;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.background_image = background_image;
		this.id = id;
		this.logo = logo;
		this.privacy = privacy;
		this._version = version;

	}

}