import java.util.ArrayList;

class RootModel {

	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String privacy;
	public String code_of_conduct;
	public VersionModel _version;
	public String timezone;
	public String location_name;
	public String schedule_published_on;
	public String description;
	public String organizer_description;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String name;
	public String start_time;
	public CreatorModel _creator;
	public int id;
	public String end_time;
	public String background_image;
	public String state;
	public CopyrightModel _copyright;
	public String type;

	public RootModel(String logo, ArrayList<Social_linksModel> social_links, String topic, String privacy, String code_of_conduct, VersionModel version, String timezone, String location_name, String schedule_published_on, String description, String organizer_description, String email, Call_for_papersModel call_for_papers, String organizer_name, String name, String start_time, CreatorModel creator, int id, String end_time, String background_image, String state, CopyrightModel copyright, String type) {

		this.logo = logo;
		this.social_links = social_links;
		this.topic = topic;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.timezone = timezone;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_description = organizer_description;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.name = name;
		this.start_time = start_time;
		this._creator = creator;
		this.id = id;
		this.end_time = end_time;
		this.background_image = background_image;
		this.state = state;
		this._copyright = copyright;
		this.type = type;

	}

}