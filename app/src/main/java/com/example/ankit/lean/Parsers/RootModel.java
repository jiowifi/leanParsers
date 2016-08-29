import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String end_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String code_of_conduct;
	public String privacy;
	public String schedule_published_on;
	public String topic;
	public String timezone;
	public String email;
	public String organizer_description;
	public int id;
	public String start_time;
	public VersionModel _version;
	public String logo;
	public String location_name;
	public String type;
	public String organizer_name;

	public RootModel(CreatorModel creator, CopyrightModel copyright, String end_time, String name, Call_for_papersModel call_for_papers, String state, String background_image, ArrayList<Social_linksModel> social_links, String description, String code_of_conduct, String privacy, String schedule_published_on, String topic, String timezone, String email, String organizer_description, int id, String start_time, VersionModel version, String logo, String location_name, String type, String organizer_name) {

		this._creator = creator;
		this._copyright = copyright;
		this.end_time = end_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.background_image = background_image;
		this.social_links = social_links;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.timezone = timezone;
		this.email = email;
		this.organizer_description = organizer_description;
		this.id = id;
		this.start_time = start_time;
		this._version = version;
		this.logo = logo;
		this.location_name = location_name;
		this.type = type;
		this.organizer_name = organizer_name;

	}

}