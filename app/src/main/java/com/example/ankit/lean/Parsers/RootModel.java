import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String organizer_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String name;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String email;
	public String topic;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String logo;
	public String description;
	public VersionModel _version;
	public int id;
	public String state;
	public String end_time;
	public String start_time;
	public String timezone;
	public String background_image;
	public String type;

	public RootModel(String schedule_published_on, String organizer_name, CreatorModel creator, String code_of_conduct, String name, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String location_name, String email, String topic, String organizer_description, Call_for_papersModel call_for_papers, String privacy, String logo, String description, VersionModel version, int id, String state, String end_time, String start_time, String timezone, String background_image, String type) {

		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._copyright = copyright;
		this.social_links = social_links;
		this.location_name = location_name;
		this.email = email;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.logo = logo;
		this.description = description;
		this._version = version;
		this.id = id;
		this.state = state;
		this.end_time = end_time;
		this.start_time = start_time;
		this.timezone = timezone;
		this.background_image = background_image;
		this.type = type;

	}

}