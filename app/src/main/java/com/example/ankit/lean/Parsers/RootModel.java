import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String start_time;
	public String organizer_description;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String end_time;
	public String privacy;
	public String logo;
	public String description;
	public String location_name;
	public String state;
	public CopyrightModel _copyright;
	public String name;
	public String topic;
	public CreatorModel _creator;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String type;

	public RootModel(String schedule_published_on, String start_time, String organizer_description, VersionModel version, ArrayList<Social_linksModel> social_links, String email, String end_time, String privacy, String logo, String description, String location_name, String state, CopyrightModel copyright, String name, String topic, CreatorModel creator, String background_image, String timezone, String organizer_name, String code_of_conduct, Call_for_papersModel call_for_papers, int id, String type) {

		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._version = version;
		this.social_links = social_links;
		this.email = email;
		this.end_time = end_time;
		this.privacy = privacy;
		this.logo = logo;
		this.description = description;
		this.location_name = location_name;
		this.state = state;
		this._copyright = copyright;
		this.name = name;
		this.topic = topic;
		this._creator = creator;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.type = type;

	}

}