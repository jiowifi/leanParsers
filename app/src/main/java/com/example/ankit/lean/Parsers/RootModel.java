import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String background_image;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String timezone;
	public String topic;
	public CopyrightModel _copyright;
	public String organizer_name;
	public VersionModel _version;
	public int id;
	public String start_time;
	public String organizer_description;
	public String schedule_published_on;
	public String description;
	public String code_of_conduct;
	public String logo;
	public String type;
	public String state;
	public String email;

	public RootModel(CreatorModel creator, String background_image, String privacy, ArrayList<Social_linksModel> social_links, String end_time, String location_name, Call_for_papersModel call_for_papers, String name, String timezone, String topic, CopyrightModel copyright, String organizer_name, VersionModel version, int id, String start_time, String organizer_description, String schedule_published_on, String description, String code_of_conduct, String logo, String type, String state, String email) {

		this._creator = creator;
		this.background_image = background_image;
		this.privacy = privacy;
		this.social_links = social_links;
		this.end_time = end_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.timezone = timezone;
		this.topic = topic;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._version = version;
		this.id = id;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.type = type;
		this.state = state;
		this.email = email;

	}

}