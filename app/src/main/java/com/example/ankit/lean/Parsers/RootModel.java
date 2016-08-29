import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public int id;
	public CreatorModel _creator;
	public String background_image;
	public String timezone;
	public String end_time;
	public String schedule_published_on;
	public String email;
	public String organizer_name;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String state;
	public String logo;
	public String code_of_conduct;
	public String type;
	public String name;
	public String topic;
	public String description;
	public String privacy;

	public RootModel(ArrayList<Social_linksModel> social_links, VersionModel version, int id, CreatorModel creator, String background_image, String timezone, String end_time, String schedule_published_on, String email, String organizer_name, String organizer_description, CopyrightModel copyright, String start_time, Call_for_papersModel call_for_papers, String location_name, String state, String logo, String code_of_conduct, String type, String name, String topic, String description, String privacy) {

		this.social_links = social_links;
		this._version = version;
		this.id = id;
		this._creator = creator;
		this.background_image = background_image;
		this.timezone = timezone;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.state = state;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.name = name;
		this.topic = topic;
		this.description = description;
		this.privacy = privacy;

	}

}